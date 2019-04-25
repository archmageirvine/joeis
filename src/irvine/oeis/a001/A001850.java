package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001850 Central Delannoy numbers: <code>a(n) = Sum_{k=0..n} C(n,k)*C(n+k,k)</code>.
 * @author Sean A. Irvine
 */
public class A001850 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(mN + k, k)));
    }
    return s;
  }
}
