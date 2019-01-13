package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A004147.
 * @author Sean A. Irvine
 */
public class A004147 implements Sequence {

  private int mN = 0;
  private boolean[] mReachableWorkspace = null;
  private int[] mQueueWorkspace = null;

  private boolean hasHalt(final int[] machine) {
    // Quick deterministic test to make sure machine has any stop state
    for (final int v : machine) {
      if ((v & ~3) == 0) {
        return true;
      }
    }
    return false;
  }

  private boolean hasReachableHalt(final int[] machine) {
    Arrays.fill(mReachableWorkspace, false);
    int queueIndex = 0;
    int queueFree = 0;
    int current = 1;
    while (!mReachableWorkspace[0]) {
      final int a = machine[2 * current - 2] >>> 2;
      if (!mReachableWorkspace[a]) {
        mReachableWorkspace[a] = true;
        mQueueWorkspace[queueFree++] = a;
      }
      final int b = machine[2 * current - 1] >>> 2;
      if (!mReachableWorkspace[b]) {
        mReachableWorkspace[b] = true;
        mQueueWorkspace[queueFree++] = b;
      }
      if (queueIndex == queueFree) {
        return false;
      }
      current = mQueueWorkspace[queueIndex++];
    }
    return true;
  }

  // State of machine: lowest bit is replacement symbol, next bit is move left-or-right, rest is next state
  // Test if the machine stops in specified number of steps
  private boolean halts(final int[] machine, int steps) {
    if (!hasHalt(machine) || !hasReachableHalt(machine)) {
      return false;
    }
    final LongDynamicByteArray tape = new LongDynamicByteArray();
    // Even numbers are positive tape positions, odd numbers are negative tape positions
    int state = 1;
    int position = 0;
    while (state != 0 && --steps >= 0) {
      final int symbol = position >= 0 ? tape.get(2 * position) : tape.get(2 * -position + 1);
      final int next = machine[2 * state + symbol - 2];
      final int r = next & 1;
      if (r != symbol) {
        if (position >= 0) {
          tape.set(2 * position, (byte) r);
        } else {
          tape.set(2 * -position + 1, (byte) r);
        }
      }
      position += (next & 2) == 0 ? 1 : -1;
      state = next >>> 2;
    }
    return state == 0;
  }

  private static boolean bump(final int[] machine, final int limit) {
    int pos = machine.length - 1;
    while (pos >= 0) {
      if (++machine[pos] < limit) {
        return true;
      }
      machine[pos--] = 0;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mReachableWorkspace = new boolean[mN + 1];
    mQueueWorkspace = new int[mN + 1];
    long c = 0;
    final int[] machine = new int[2 * mN];
    final int limit = 4 * (mN + 1);
    do {
      if (halts(machine, 1000)) { // heuristic, 1000 is definitely large enough for a(3)
        ++c;
      }
    } while (bump(machine, limit));
    return Z.valueOf(c);
  }
}
