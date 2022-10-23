package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007685 a(n) = Product_{k=1..n} binomial(2*k,k).
 * @author Sean A. Irvine
 */
public class A007685 extends Sequence0 {

  private long mN = -1;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mProd = mProd.multiply(Binomial.binomial(2 * mN, mN));
    }
    return mProd;
  }
}
