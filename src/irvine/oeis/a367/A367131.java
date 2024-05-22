package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367131 a(n) is the sum of the divisors of A000058(n) (Sylvester's sequence).
 * @author Sean A. Irvine
 */
public class A367131 extends A000058 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
