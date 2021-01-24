package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038501 Upper bound on minimal norm of a quadratic form where n runs over the odd primes.
 * @author Sean A. Irvine
 */
public class A038501 extends A000040 {

  private static final ComputableReals R = ComputableReals.SINGLETON;
  {
    super.next();
  }

  private CR f(final int n, final CR d) {
    final CR n2 = CR.valueOf(new Q(n, 2));
    return CR.ONE.add(n2).lnGamma().exp()
      .divide(R.pow(CR.SQRT_PI, n))
      .shiftLeft(n)
      .divide(R.pow(CR.valueOf(n), n2))
      .multiply(d.sqrt());
  }

  @Override
  public Z next() {
    final int lambda = super.next().intValueExact();
    return f((lambda - 1) / 2, R.pow(CR.valueOf(lambda), CR.valueOf((lambda - 3) / 2))).floor();
  }
}
