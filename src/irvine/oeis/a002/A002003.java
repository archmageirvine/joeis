package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002003 a(n) = 2 * Sum_{k=0..n-1} binomial(n-1, k)*binomial(n+k, k).
 * @author Sean A. Irvine
 */
public class A002003 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      s = s.add(Binomial.binomial(mN - 1, k).multiply(Binomial.binomial(mN + k, k)));
    }
    return s.multiply2();
  }
}
