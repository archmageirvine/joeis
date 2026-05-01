package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395447 Numerators of the coefficient of Pi^(4n+1) in Plouffe's formula for zeta(4n+1).
 * @author Sean A. Irvine
 */
public class A395447 extends Sequence1 {

  private int mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    final Q s1 = Rationals.SINGLETON.sum(0, mN, j -> mB.get(4 * (long) mN - 4 * j + 2).multiply(mB.get(4 * j)).multiply(Z.NEG_ONE.pow((long) mN + j).shiftLeft(2 * ((long) mN + j)).multiply(Binomial.binomial(4 * (long) mN + 2, 4 * j))));
    final Q s2 = Rationals.SINGLETON.sum(0, 2 * (long) mN + 1, j -> mB.get(4 * (long) mN - 2 * j + 2).multiply(mB.get(2 * j)).multiply(Z.NEG_ONE.pow(j).shiftLeft(2 * j).multiply(Binomial.binomial(4 * (long) mN + 2, 2 * j))));
    return select(s1.add(s2.divide(2)).multiply(Z.TWO.pow(4 * (long) mN + 1)).divide(Functions.FACTORIAL.z(4 * (long) mN + 2)).divide(Z.ONE.add(Z.NEG_ONE.pow(mN).shiftLeft(2 * (long) mN)).subtract(Z.TWO.pow(4 * (long) mN + 1))));
  }
}
