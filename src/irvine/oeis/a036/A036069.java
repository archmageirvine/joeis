package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036069 Denominator of rational part of Haar measure on Grassmannian space G(n,1).
 * @author Sean A. Irvine
 */
public class A036069 implements Sequence {

  private int mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    final int k = ++mN / 2;
    if ((mN & 1) == 0) {
      return select(new Q(Binomial.binomial(2 * k - 1, k).multiply(2 * k), Z.ONE.shiftLeft(2 * k)));
    } else {
      return select(new Q(Z.ONE.shiftLeft(2 * k), Binomial.binomial(2 * k, k)));
    }
  }
}
