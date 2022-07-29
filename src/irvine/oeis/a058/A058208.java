package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A058208 Floor(6*n*sqrt(n)/Pi^2) - sigma(n), where sigma(n) is the sum of the divisors of n (A000203).
 * @author Sean A. Irvine
 */
public class A058208 extends A000203 {

  private static final CR PI2 = CR.PI.multiply(CR.PI);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(6 * mN).divide(PI2).floor().subtract(super.next());
  }
}

