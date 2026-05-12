package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395748 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A395748 extends Sequence1 {

  private long mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    ++mN;
    final Q s1 = Rationals.SINGLETON.sum(0, mN, j -> mB.get(4 * mN - 4 * j + 2).multiply(mB.get(4 * j)).multiply(Binomial.binomial(4 * mN + 2, 4 * j)).multiply(Z.valueOf(-4).pow(mN + j)));
    final Q s2 = Rationals.SINGLETON.sum(0, 2 * mN + 1, j -> mB.get(4 * mN - 2 * j + 2).multiply(mB.get(2 * j)).multiply(Binomial.binomial(4 * mN + 2, 2 * j)).multiply(Z.valueOf(-4).pow(j)));
    final Q f = s1.add(s2.divide(2)).multiply(Z.ONE.shiftLeft(4 * mN + 1)).divide(Functions.FACTORIAL.z(4 * mN + 2));
    return f.den().multiply(2);
  }
}
