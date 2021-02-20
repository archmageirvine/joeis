package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023052 Perfect Digital Invariants: numbers that are the sum of some fixed power of their digits.
 * @author Sean A. Irvine
 */
public class A023052 implements Sequence {

  // Not fast enough to be competitive

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Z[] mPowers = new Z[10];
  private Z[] mNines = null;
  private Z[][] mDigitPositions = null;
  private int mLength = 0;

  private void search(final Z n, final Z sum, final int pos) {
    if (pos < 0) {
      if (sum.equals(n)) {
        mA.add(n);
      }
      return;
    }
    final int first = pos == mLength - 1 ? 1 : 0;
    for (int digit = first; digit < mPowers.length; ++digit) {
      final Z ss = sum.add(mPowers[digit]);
      final Z nn = n.add(mDigitPositions[pos][digit]);
      if (ss.compareTo(nn) > 0) {
        break; // already exceeded target
      }
      if (ss.add(mNines[pos]).compareTo(nn) < 0) {
        continue; // even if remaining digits are 9 we cannot get required amount
      }
      search(nn, ss, pos - 1);
    }
  }

  @Override
  public Z next() {
    // Computes all values of given digit length in one hit
    while (mA.isEmpty()) {
      if (++mLength == 1) {
        for (long k = 0; k < 10; ++k) {
          mA.add(Z.valueOf(k));
        }
      } else if (mLength > 2) { // no terms of length 2
        final int minPower = (int) (Z.TEN.pow(mLength - 1).log(9));
        final int maxPower = (int) Math.ceil(Z.TEN.pow(mLength - 1).divide(mLength).log(2));
        for (int k = minPower; k <= maxPower; ++k) {
          // Precompute a bunch of constants for this power and length
          for (int j = 0; j < mPowers.length; ++j) {
            mPowers[j] = Z.valueOf(j).pow(k);
          }
          mNines = new Z[mLength];
          mDigitPositions = new Z[mLength][10];
          for (int j = 0; j < mNines.length; ++j) {
            mNines[j] = mPowers[9].multiply(j);
            for (int i = 0; i < 10; ++i) {
              mDigitPositions[j][i] = Z.TEN.pow(j).multiply(i);
            }
          }
          search(Z.ZERO, Z.ZERO, mLength - 1);
        }
      }
    }
    return mA.pollFirst();
  }

}
