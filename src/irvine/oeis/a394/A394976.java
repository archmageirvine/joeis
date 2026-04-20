package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394976 Numerators of the coefficient of Pi^(2n+1) in Plouffe's formula for zeta(2n+1).
 * @author Sean A. Irvine
 */
public class A394976 extends Sequence1 {

  // After Jwalin Bhatt

  private int mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      final long n = mN / 2 + 1;
      final Q s = Rationals.SINGLETON.sum(0, 2 * n, j -> mB.get(4 * n - 2 * j).multiply(mB.get(2 * j)).multiply(Z.NEG_ONE.pow(j).multiply(Binomial.binomial(4 * n, 2 * j))));
      return select(s.multiply(Z.TWO.pow(4 * n - 2)).divide(Functions.FACTORIAL.z(4 * n)).negate());
    } else {
      final long n = mN / 2;
      final Q s1 = Rationals.SINGLETON.sum(0, n, j -> mB.get(4 * n - 4 * j + 2).multiply(mB.get(4 * j)).multiply(Z.NEG_ONE.pow(n + j).shiftLeft(2 * (n + j)).multiply(Binomial.binomial(4 * n + 2, 4 * j))));
      final Q s2 = Rationals.SINGLETON.sum(0, 2 * n + 1, j -> mB.get(4 * n - 2 * j + 2).multiply(mB.get(2 * j)).multiply(Z.NEG_ONE.pow(j).shiftLeft(2 * j).multiply(Binomial.binomial(4 * n + 2, 2 * j))));
      return select(s1.add(s2.divide(2)).multiply(Z.TWO.pow(4 * n + 1)).divide(Functions.FACTORIAL.z(4 * n + 2)).divide(Z.ONE.add(Z.NEG_ONE.pow(n).shiftLeft(2 * n)).subtract(Z.TWO.pow(4 * n + 1))));
    }
  }
}
