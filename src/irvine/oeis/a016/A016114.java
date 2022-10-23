package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016114 Circular primes (numbers that remain prime under cyclic shifts of digits).
 * @author Sean A. Irvine
 */
public class A016114 extends Sequence1 {

  // A somewhat smart approach

  private static final Z[] SMALL = {Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN};

  private long mLimit = 4;
  private long mN = -1;
  private int mDigits = 1;
  private int mShift = 0;

  private Z candidate(final int digits, final long packed) {
    Z res = Z.ZERO;
    for (int k = digits - 1; k >= 0; --k) {
      res = res.multiply(10);
      final long bits = (packed >> (2 * k)) & 3;
      res = res.add(1 | (bits * 3)); // maps 0 -> 1, 1 -> 3, 2 -> 7, 3 -> 9
    }
    return res;
  }

  @Override
  public Z next() {
    // Deal with single digit irregular cases
    if (mLimit == 4) {
      if (++mN < SMALL.length) {
        return SMALL[(int) mN];
      }
    }
    // Any other circular prime must be of the form [1379]*
    // We generate all such possibilities using a 2-bit per digit system
    outer:
    while (true) {
      if (++mN >= mLimit) {
        // Increase number of digits by 1
        mShift = 2 * mDigits;
        if (++mDigits == 31) {
          throw new UnsupportedOperationException();
        }
        mLimit <<= 2;
        mN = 0;
      }
      final Z candidate = candidate(mDigits, mN);
      if (candidate.isProbablePrime()) {
        // Remains to check all cyclic shifts, we also require candidate to be
        // the smallest of the possible cyclic shifts.  We do this by rotating
        // mN because we can verify smallness of the candidate without first
        // doing primality tests
        long m = mN;
        for (int k = 1; k < mDigits; ++k) {
          m = ((m & 3) << mShift) | (m >>> 2);
          if (m < mN) {
            continue outer; // mN is not smallest of possible shifts
          }
          if (m == mN) {
            return candidate; // must be a repunit (no further testing needed)
          }
        }
        // Ok, so now check primality
        m = mN;
        for (int k = 1; k < mDigits; ++k) {
          m = ((m & 3) << mShift) | (m >>> 2);
          if (!candidate(mDigits, m).isProbablePrime()) {
            continue outer; // mN is not smallest of possible shifts
          }
        }
        return candidate;
      }
    }
  }
}
