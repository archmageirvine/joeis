package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A049820 a(n) = n - d(n), where d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A049820 extends A000005 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).subtract(t);
  }
}
