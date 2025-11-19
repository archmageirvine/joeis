package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389342 Numerators C(n) of the rational part in J(n) = Integral_{x=0..Pi/2} x*cos(x)^(2n) dx.
 * @author Sean A. Irvine
 */
public class A389342 extends Sequence0 {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 1; k <= mN; k += 2) {
      sum = sum.add(new Q(Binomial.binomial(2 * mN, mN - k), k * k));
    }
    return select(sum.divide(Z.ONE.shiftLeft(2 * mN)));
  }
}
