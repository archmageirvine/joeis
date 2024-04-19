package irvine.oeis.a046;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046761 Largest number that is equal to sum of n-th powers of its digits.
 * @author Sean A. Irvine
 */
public class A046761 extends Sequence0 {

  // Too slow to be useful, there must be a better way

  private int mN = -1;
  private Z mMax = Z.ZERO;
  private final Z[] mDigitPowers = new Z[10];
  {
    Arrays.fill(mDigitPowers, Z.ONE);
  }

  private void search(final Z m, final Z sumOfPowers) {
    final int c = m.compareTo(sumOfPowers);
    if (c >= 0) {
      if (c == 0) {
        mMax = mMax.max(m);
      } else {
        return;
      }
    }
    for (int k = 0; k < mDigitPowers.length; ++k) {
      search(m.multiply(10).add(k), sumOfPowers.add(mDigitPowers[k]));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    for (int k = 0; k < mDigitPowers.length; ++k) {
      mDigitPowers[k] = mDigitPowers[k].multiply(k);
    }
    mMax = Z.ZERO;
    for (int k = 1; k < mDigitPowers.length; ++k) {
      search(Z.valueOf(k), mDigitPowers[k]);
    }
    return mMax;
  }
}
