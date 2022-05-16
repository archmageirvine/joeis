package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.group.IntegersModMul;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003473 Generalized Euler phi function (for p=2).
 * @author Sean A. Irvine
 */
public class A003473 implements Sequence {

  protected int mN = 0;

  protected long p() {
    return 2;
  }

  // Generalized Euler phi, after Joerg Arndt
  private Q numNormalP(final int n) {
    final Z p = Z.valueOf(p());
    Q pp = Q.ONE;
    for (final Z d : Jaguar.factor(n).divisors()) {
      //final int r = Z.ONE.equals(d) ? 1 : new IntegersModMul(d).order(p).intValueExact();
      final int r = Z.ONE.equals(d) ? 1 : new IntegersModMul(d).order(p).intValueExact();
      final Z pr = p.pow(r);
      pp = pp.multiply(new Q(pr.subtract(1), pr).pow(Euler.phi(d).divide(r).intValueExact()));
    }
    return pp;
  }

  private Q numNormal(final int n) {
    final long p = p();
    int q = n;
    while (0 == q % p) {
      q /= p;
    }
    // n == q * p^t
    return numNormalP(q).multiply(Z.valueOf(p).pow(n)).divide(n);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return numNormal(mN).multiply(mN).toZ();
  }
}

