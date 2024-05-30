package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A046522 a(n) = 2*floor(sqrt(n)) - d(n), where d(n) is the number of divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A046522 extends A000005 {

  @Override
  public Z next() {
    return super.next().subtract(2 * Functions.SQRT.l(mN)).negate();
  }
}

