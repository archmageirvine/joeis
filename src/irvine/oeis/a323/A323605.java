package irvine.oeis.a323;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A323605 Smallest prime divisor of A000058(n) = A007018(n) + 1 (Sylvester's sequence).
 * @author Sean A. Irvine
 */
public class A323605 extends A000058 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
