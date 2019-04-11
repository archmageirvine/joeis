package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;

/**
 * A002428 Numerators of coefficients of expansion of arctan(x)^2 <code>= x^2 - 2/3*x^4 + 23/45*x^6 - 44/105*x^8 + 563/1575*x^10 - 3254/10395*x^12 + ..</code>.
 * @author Sean A. Irvine
 */
public class A002428 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(new Q(1, mN * (2 * k - 1)));
    }
    final Z r = s.num();
    return (mN & 1) == 1 ? r : r.negate();
  }
}
