package irvine.oeis.a005;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005265 a(1)=3, b(n) = Product_{k=1..n} a(k), a(n+1) is the smallest prime factor of b(n)-1.
 * @author Sean A. Irvine
 */
public class A005265 extends Sequence1 {

  private Z mProd = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : LeastPrimeFactorizer.lpf(mProd.subtract(1));
    mProd = mProd.multiply(mA);
    return mA;
  }
}
