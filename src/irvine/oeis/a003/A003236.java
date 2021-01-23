package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003236 a(n) = Sum_{k=0..n} (-1)^(n-k) C(n,k)*C((k+1)^2, n).
 * @author Sean A. Irvine
 */
public class A003236 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial((k + 1) * (k + 1), mN)));
    }
    return s;
  }
}
