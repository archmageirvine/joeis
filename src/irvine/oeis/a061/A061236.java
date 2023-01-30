package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061236 Smallest number with p(n)^3 divisors where p(n) is n-th prime.
 * @author Sean A. Irvine
 */
public class A061236 extends A000040 {

  private static final Z Z30 = Z.valueOf(30);

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.TWO.equals(p) ? Z.valueOf(24) : Z30.pow(p.subtract(1));
  }
}
