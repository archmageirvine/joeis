package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077230.
 * @author Sean A. Irvine
 */
public class A077230 extends Sequence0 {

  protected int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.TWO);
    }
    return select(Rationals.SINGLETON.sum(1, mN,
      k -> Rationals.SINGLETON.sum(1, k,
        j -> new Q(Z.NEG_ONE.pow(j).multiply(Functions.FACTORIAL.z(j)).multiply(Binomial.binomial(k, j)).multiply(Functions.STIRLING1.z(mN + j, j)), Functions.FACTORIAL.z(mN + j))
          .multiply(Binomial.binomial(2L * k , k)).divide(Z.ONE.shiftLeft(2L * k)))));
  }
}
