package irvine.math.wolfram;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;

/**
 * Exact halting certificates and maxima for Wolfram's one-sided two-state binary machines.
 * @author Gregory Morse
 */
public final class ExactWolframBinary {
  private static final int HALT = 1;
  private static final int DIVERGES = 2;
  private static final int UNRESOLVED = 3;
  private static final int[] REFLECTORS = reflectors();
  private static final int[] BARRIER_WIDTHS = {1, 2, 3, 4, 6, 8, 11, 15};
  private final int[][] mReturns = new int[4096][];
  private final byte[][] mBarrierMemo = new byte[9][];
  private int mSteps;
  private int mRightmost;
  private long mTape;

  /** Construct an exact machine simulator. */
  public ExactWolframBinary() {
  }

  private static int rule(final int machine, final int state, final int read) {
    return machine >>> (3 * (2 * (1 - state) + read)) & 7;
  }

  // If every possible state arriving from the right bounces off an
  // unchanged symbol, a cell containing it is a permanent left wall.
  private static int[] reflectors() {
    final int[] result = new int[4096];
    for (int machine = 0; machine < result.length; ++machine) {
      int mask = 3;
      for (int q = 0; q < 2; ++q) {
        for (int a = 0; a < 2; ++a) {
          final int tr = rule(machine, q, a);
          if ((tr & 1) != 0) {
            for (int s = 0; s < 2; ++s) {
              if ((rule(machine, tr >>> 2, s) & 3) != s << 1) {
                mask &= ~(1 << s);
              }
            }
          }
        }
      }
      result[machine] = mask;
    }
    return result;
  }

  private int[] returnStates(final int machine) {
    if (mReturns[machine] != null) {
      return mReturns[machine];
    }
    final int[] left = new int[2];
    final int[] right = new int[2];
    for (int q = 0; q < 2; ++q) {
      for (int read = 0; read < 2; ++read) {
        final int tr = rule(machine, q, read);
        ((tr & 1) == 0 ? right : left)[q] |= 1 << (tr >>> 2);
      }
    }
    // Balanced nonnegative walks: empty, concatenate, or right/walk/left.
    final int[] balanced = {1, 2};
    boolean change;
    do {
      change = false;
      for (int q = 0; q < 2; ++q) {
        int reach = balanced[q];
        for (int r = 0; r < 2; ++r) {
          if ((balanced[q] & 1 << r) != 0) {
            reach |= balanced[r];
          }
          if ((right[q] & 1 << r) != 0) {
            for (int end = 0; end < 2; ++end) {
              if ((balanced[r] & 1 << end) != 0) {
                reach |= left[end];
              }
            }
          }
        }
        if (reach != balanced[q]) {
          balanced[q] = reach;
          change = true;
        }
      }
    } while (change);
    final int[] exits = new int[2];
    for (int q = 0; q < 2; ++q) {
      for (int r = 0; r < 2; ++r) {
        if ((balanced[q] & 1 << r) != 0) {
          exits[q] |= left[r];
        }
      }
    }
    mReturns[machine] = exits;
    return exits;
  }

  private boolean barrier(final int machine, final long input, final int width) {
    final int[] exits = returnStates(machine);
    final ArrayDeque<Long> queue = new ArrayDeque<>();
    final Set<Long> seen = new HashSet<>();
    queue.add((input & ((1L << width) - 1)) << 6);
    while (!queue.isEmpty()) {
      final long entry = queue.removeLast();
      if (!seen.add(entry)) {
        continue;
      }
      if (seen.size() > 5000) {
        return false;
      }
      long tape = entry >>> 6;
      final int state = (int) entry & 1;
      int head = (int) (entry >>> 1) & 31;
      final int read = (int) (tape >>> head) & 1;
      final int tr = rule(machine, state, read);
      tape ^= (long) (read ^ (tr >>> 1 & 1)) << head;
      head += (tr & 1) == 0 ? 1 : -1;
      if (head < 0) {
        return false;  // Potential abstract left exit; this is not a proof of halting.
      }
      final int next = tr >>> 2;
      if (head == width) {
        // The prefix is unchanged until the next entry from the right.
        for (int q = 0; q < 2; ++q) {
          if ((exits[next] & 1 << q) != 0) {
            queue.add((tape << 6) | ((long) head - 1) << 1 | q);
          }
        }
      } else {
        queue.add((tape << 6) | (long) head << 1 | next);
      }
    }
    return true;
  }

  private int classify(final int machine, final long input) {
    int state = 0;
    int head = 0;
    long tape = input;
    int right = 63 - Long.numberOfLeadingZeros(input);
    int fresh0 = -1;
    int fresh1 = -1;
    int savedHead = 0;
    int savedState = 0;
    long savedTape = tape;
    int checkpointSize = 1;
    int age = 0;
    mRightmost = 0;
    for (mSteps = 1; mSteps <= 2_000_000; ++mSteps) {
      final int read = (int) (tape >>> head) & 1;
      final int rule = rule(machine, state, read);
      if ((REFLECTORS[machine] & 1 << read) != 0 && (rule & 3) == read << 1) {
        return DIVERGES;
      }
      if (read != (rule >>> 1 & 1)) {
        tape ^= 1L << head;
      }
      head += (rule & 1) == 0 ? 1 : -1;
      state = rule >>> 2;
      if (head < 0) {
        mTape = tape;
        return HALT;
      }
      if (head == savedHead && state == savedState && tape == savedTape) {
        return DIVERGES;
      }
      if (++age == checkpointSize) {
        savedHead = head;
        savedState = state;
        savedTape = tape;
        checkpointSize <<= 1;
        age = 0;
      }
      if (head < fresh0) {
        fresh0 = -1;
      }
      if (head < fresh1) {
        fresh1 = -1;
      }
      if (head > right) {
        // Both first-visit suffixes are blank. If a matching earlier entry
        // survived, the interval between them never consulted the old prefix.
        if (state == 0 && fresh0 >= 0 || state == 1 && fresh1 >= 0) {
          return DIVERGES;
        }
        right = head;
        if (state == 0) {
          fresh0 = head;
        } else {
          fresh1 = head;
        }
      }
      if (head >= Long.SIZE) {
        return UNRESOLVED;
      }
      mRightmost = Math.max(mRightmost, head);
    }
    return UNRESOLVED;
  }

  private static long suffix(final long tape, final int cut) {
    return cut == Long.SIZE ? 0 : tape >>> cut;
  }

  private static boolean translatedTail(final int machine, final long input) {
    final int[] visits = new int[Long.SIZE];
    final int[] entry = new int[Long.SIZE];
    final int[] entryState = new int[Long.SIZE];
    final long[] entryTape = new long[Long.SIZE];
    int state = 0;
    int head = 0;
    int right = 63 - Long.numberOfLeadingZeros(input);
    long tape = input;
    for (int step = 1; step <= 8000 && head >= 0 && head < Long.SIZE; ++step) {
      visits[head] = step;
      final int read = (int) (tape >>> head) & 1;
      final int tr = rule(machine, state, read);
      tape ^= (long) (read ^ (tr >>> 1 & 1)) << head;
      state = tr >>> 2;
      head += (tr & 1) == 0 ? 1 : -1;
      if (head <= right) {
        continue;
      }
      right = head;
      for (int old = 1; old < head; ++old) {
        if (entry[old] == 0 || entryState[old] != state) {
          continue;
        }
        // If no cell left of the previous cut was consulted, the identical
        // suffix can replay the whole interval conjugated by a translation.
        int cut = old;
        for (int i = 0; i < old; ++i) {
          if (visits[i] > entry[old]) {
            cut = i;
            break;
          }
        }
        if (suffix(entryTape[old], cut) == suffix(tape, cut + head - old)) {
          return true;
        }
      }
      if (head < Long.SIZE) {
        entry[head] = step;
        entryState[head] = state;
        entryTape[head] = tape;
      }
    }
    return false;
  }

  private int decide(final int machine, final long input) {
    // An invariant of the leftmost cell alone can rule out arbitrarily
    // long right-side excursions without simulating them.
    if (memoizedBarrier(machine, input, 1)) {
      return DIVERGES;
    }
    final int status = classify(machine, input);
    if (status != UNRESOLVED) {
      return status;
    }
    for (final int width : BARRIER_WIDTHS) {
      if (width != 1 && memoizedBarrier(machine, input, width)) {
        return DIVERGES;
      }
    }
    return translatedTail(machine, input) ? DIVERGES : UNRESOLVED;
  }

  private boolean memoizedBarrier(final int machine, final long input, final int width) {
    if (width >= mBarrierMemo.length) {
      return barrier(machine, input, width);
    }
    if (mBarrierMemo[width] == null) {
      mBarrierMemo[width] = new byte[4096 << width];
    }
    final byte[] memo = mBarrierMemo[width];
    final int key = machine << width | (int) input & ((1 << width) - 1);
    if (memo[key] == 0) {
      // This proof overapproximates all possible tape outside the prefix.
      memo[key] = (byte) (barrier(machine, input, width) ? 1 : 2);
    }
    return memo[key] == 1;
  }

  /**
   * Run a machine or prove that it does not halt. An exhausted checker is
   * reported as unsupported, not as a non-halting answer.
   * @param machine Wolfram rule number
   * @param input initial tape in binary
   * @return running time, or -1 with a non-halting proof
   */
  public int haltingTime(final int machine, final long input) {
    if (machine < 0 || machine >= 4096 || input < 0) {
      throw new IllegalArgumentException();
    }
    if ((machine & 0x249) == 0) {
      return -1;  // Every rule moves right, so the left edge cannot be reached.
    }
    final int status = decide(machine, input);
    if (status == UNRESOLVED) {
      throw new UnsupportedOperationException("No exact certificate for rule " + machine + " on input " + input);
    }
    return status == HALT ? mSteps : -1;
  }

  /**
   * Maximize the final tape value and rightmost position over all halting rules.
   * @param input initial tape in binary
   * @return maximum tape value and maximum rightmost position, in that order
   */
  public Z[] maxima(final long input) {
    long tape = 0;
    int right = 0;
    for (int machine = 0; machine < 4096; ++machine) {
      if (haltingTime(machine, input) >= 0) {
        if (Long.compareUnsigned(mTape, tape) > 0) {
          tape = mTape;
        }
        right = Math.max(right, mRightmost);
      }
    }
    return new Z[] {new Z(Long.toUnsignedString(tape)), Z.valueOf(right)};
  }
}
