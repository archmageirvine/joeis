package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002003 <code>2*Sum_{k=0..n-1} C(n-1,k)*C(n+k,k)</code>.
 * @author Sean A. Irvine
 */
public class A002003 implements Sequence {

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
