package irvine.oeis.a069;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069877 Smallest number with a prime signature whose indices are the decimal digits of n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A069877 extends Sequence0 {

  private long mN = -1;
  private int mLength = 1;
  private long mLim = 10;

  @Override
  public Z next() {
    if (++mN == mLim) {
      ++mLength;
      mLim *= 10;
    }
    final int[] digits = new int[mLength];
    long m = mN;
    for (int k = 0; k < digits.length; ++k) {
      digits[k] = (int) (m % 10);
      m /= 10;
    }
    Arrays.sort(digits);
    return FactorUtils.signatureToZ(digits);
  }
}

