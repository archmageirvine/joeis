package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A131956 Busy Beaver variation: maximum number of steps for a 2-state, 2-symbol Turing machine running on a tape which is initialized with the number n in binary and 0's everywhere else. The machine is started at the rightmost bit in the number n.
 * @author Gregory Morse
 */
public class A131956 extends Sequence0 {
  private static final int LIMIT = 256;
  private final int[] mRules = new int[4];
  private final int[] mStates = new int[LIMIT];
  private final int[] mPositions = new int[LIMIT];
  private final Z[] mTape = new Z[LIMIT];
  private final boolean mOnes;
  private Z mN = Z.NEG_ONE;

  protected A131956(final boolean ones) {
    mOnes = ones;
  }

  /** Construct the sequence. */
  public A131956() {
    this(false);
  }

  private boolean repeats(final int time, final int state, final int position, final Z tape, final Z[] masks) {
    int min = position;
    int max = position;
    for (int j = time - 1; j >= 0; --j) {
      final int old = mPositions[j];
      min = Math.min(min, old);
      max = Math.max(max, old);
      if (mStates[j] != state) {
        continue;
      }
      final int drift = position - old;
      // With drift, the repeated segment can only inspect the matching half-line.
      if (drift > 0) {
        if (tape.shiftRight(min + drift).equals(mTape[j].shiftRight(min))) {
          return true;
        }
      } else if (drift < 0) {
        if (tape.and(masks[max + drift + 1]).shiftLeft(-drift).equals(mTape[j].and(masks[max + 1]))) {
          return true;
        }
      } else if (tape.xor(mTape[j]).and(masks[max + 1].xor(masks[min])).isZero()) {
        return true;
      }
    }
    return false;
  }

  private int simulate(final int origin, final Z initial, final Z[] masks) {
    Z tape = initial;
    int position = origin;
    int state = 0;
    final boolean haltA = mRules[0] >= 8 || mRules[1] >= 8;
    final boolean haltB = mRules[2] >= 8 || mRules[3] >= 8;
    final boolean a = haltA || haltB && (mRules[0] >= 4 || mRules[1] >= 4);
    final boolean b = haltB || haltA && (mRules[2] < 4 || mRules[3] < 4);
    for (int time = 0; time < LIMIT; ++time) {
      if (!(state == 0 ? a : b)) {
        return 0;
      }
      final int symbol = tape.testBit(position) ? 1 : 0;
      final int rule = mRules[2 * state + symbol];
      if (rule >= 8) {
        return mOnes ? tape.bitCount() - symbol + (rule & 1) : time + 1;
      }
      if (repeats(time, state, position, tape, masks)) {
        return 0;
      }
      mTape[time] = tape;
      mPositions[time] = position;
      mStates[time] = state;
      if (((rule >>> 1) & 1) != symbol) {
        tape = tape.xor(Z.ONE.shiftLeft(position));
      }
      position += (rule & 1) == 0 ? -1 : 1;
      state = rule >>> 2;
    }
    throw new UnsupportedOperationException("Machine did not halt or yield a nonhalting certificate");
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final int origin = LIMIT + mN.bitLength();
    Z input = Z.ZERO;
    for (int k = 0; k < mN.bitLength(); ++k) {
      if (mN.testBit(k)) {
        input = input.setBit(origin - k);
      }
    }
    final Z[] masks = new Z[origin + LIMIT + 2];
    for (int k = 0; k < masks.length; ++k) {
      masks[k] = Z.ONE.shiftLeft(k).subtract(1);
    }
    int max = 0;
    // Halt direction does not affect either measurement, so use two halt rules.
    for (int k = 0; k < 10000; ++k) {
      int v = k;
      for (int j = 0; j < mRules.length; ++j) {
        mRules[j] = v % 10;
        v /= 10;
      }
      max = Math.max(max, simulate(origin, input, masks));
    }
    return Z.valueOf(max);
  }
}
