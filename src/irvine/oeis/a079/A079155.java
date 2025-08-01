package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079155 The number of primes less than 10^n whose digital root (A038194) is also prime.
 * @author Sean A. Irvine
 */
public class A079155 extends A000040 {

  private Z mLim = Z.ONE;
  private Z mP = super.next();
  private long mCount = 0;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    while (mP.compareTo(mLim) < 0) {
      if (Functions.DIGIT_SUM_ROOT.z(mP).isProbablePrime()) {
        ++mCount;
      }
      mP = super.next();
    }
    return Z.valueOf(mCount);
  }
}

