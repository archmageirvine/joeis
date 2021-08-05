package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A049559 a(n) = gcd(n - 1, phi(n)).
 * @author Sean A. Irvine
 */
public class A049559 extends A000010 {

  @Override
  public Z next() {
    return super.next().gcd(Z.valueOf(mN - 1));
  }
}

