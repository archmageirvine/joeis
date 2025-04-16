package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076754 a(n) = nearest integer to the skewness of the divisors of n.
 * @author Sean A. Irvine
 */
public class A076754 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ZERO;
    }
    final Z s0 = Functions.SIGMA0.z(mN);
    if (Z.TWO.equals(s0)) {
      return Z.ZERO;
    }
    final Q mu = new Q(Functions.SIGMA1.z(mN), s0);
    Q mu3 = Q.ZERO;
    Q mu2 = Q.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      mu2 = mu2.add(new Q(d).subtract(mu).square());
      mu3 = mu3.add(new Q(d).subtract(mu).pow(3));
    }
    mu2 = mu2.divide(s0);
    mu3 = mu3.divide(s0);
    return CR.valueOf(mu3).divide(CR.valueOf(mu2.pow(3)).sqrt()).round();
  }
}
