package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A038040 a(n) = n*d(n), where d(n) = number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A038040 extends A000005 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
