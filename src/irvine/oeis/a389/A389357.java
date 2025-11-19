package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389357 Numerators E(n) in the closed form of the integral J(2n+1) = Integral_{x=0..Pi/2} x * cos(x)^(2n+1) dx = binomial(2n+1,n)/2^(2n+2) * Pi - E(n)/F(n).
 * @author Sean A. Irvine
 */
public class A389357 extends Sequence0 {

  private long mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 1; k <= 2 * mN + 1; k += 2) {
      sum = sum.add(new Q(Binomial.binomial(2 * mN + 1, (2 * mN + 1 - k) / 2), k * k));
    }
    return select(sum.divide(Z.ONE.shiftLeft(2 * mN)));
  }
}
