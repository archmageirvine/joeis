package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395662 Coefficient of zeta(n) in the linear equality by Plouffe for the odd values of the Riemann zeta function.
 * @author Sean A. Irvine
 */
public class A395662 extends Sequence1 {
  
  private long mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final long n = mN / 2 + 1;
      final Q s = Rationals.SINGLETON.sum(0, 2 * n, j -> mB.get(4 * n - 2 * j).multiply(mB.get(2 * j)).multiply(Binomial.binomial(4 * n, 2 * j)).multiply(Z.NEG_ONE.pow(j)));
      return s.multiply(Z.valueOf(-2).pow(4 * n - 2)).divide(Functions.FACTORIAL.z(4 * n)).den();
    } else {
      final long n = mN / 2;
      final Q s1 = Rationals.SINGLETON.sum(0, n, j -> mB.get(4 * n - 4 * j + 2).multiply(mB.get(4 * j)).multiply(Binomial.binomial(4 * n + 2, 4 * j)).multiply(Z.valueOf(-4).pow(n + j)));
      final Q s2 = Rationals.SINGLETON.sum(0, 2 * n + 1, j -> mB.get(4 * n - 2 * j + 2).multiply(mB.get(2 * j)).multiply(Binomial.binomial(4 * n + 2, 2 * j)).multiply(Z.valueOf(-4).pow(j)));
      final Z s = Z.ONE.add(Z.valueOf(-4).pow(n)).subtract(Z.ONE.shiftLeft(4 * n + 1));
      final Q f = s1.add(s2.divide(2)).multiply(Z.ONE.shiftLeft(4 * n + 1)).divide(Functions.FACTORIAL.z(4 * n + 2));
      return f.den().negate().multiply(s);
    }
  }
}
