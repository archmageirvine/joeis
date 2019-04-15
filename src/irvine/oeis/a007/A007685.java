package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007685 <code>a(n) =</code> Product_{k=1..n} <code>binomial(2*k,k)</code>.
 * @author Sean A. Irvine
 */
public class A007685 implements Sequence {

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
