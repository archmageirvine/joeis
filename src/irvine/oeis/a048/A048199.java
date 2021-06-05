package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048199 Distance of primes to next odd multiple of 5 (where n mod 10 = 5),.
 * @author Sean A. Irvine
 */
public class A048199 extends A000040 {

  @Override
  public Z next() {
    final long r = super.next().mod(10);
    return Z.valueOf(r <= 5 ? 5 - r : 15 - r);
  }
}
