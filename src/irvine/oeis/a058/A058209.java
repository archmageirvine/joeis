package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A058209 Floor( exp(gamma) n log log n ) - sigma(n), where gamma is Euler's constant (A001620) and sigma(n) is sum of divisors of n (A000203).
 * @author Sean A. Irvine
 */
public class A058209 extends A000203 {

  private static final CR EXP_GAMMA = CR.GAMMA.exp();
  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    return EXP_GAMMA.multiply(++mN).multiply(CR.valueOf(mN).log().log()).floor().subtract(super.next());
  }
}

