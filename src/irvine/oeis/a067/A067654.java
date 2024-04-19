package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067654 Numerators of the coefficients in power series expansion of exp(2x/(1-x)).
 * @author Sean A. Irvine
 */
public class A067654 extends Sequence1 {

  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(Rationals.SINGLETON.sum(1, ++mN, k -> {
      return new Q(Binomial.binomial(mN - 1, k - 1).shiftLeft(k), Functions.FACTORIAL.z(k));
    }));
  }
}
