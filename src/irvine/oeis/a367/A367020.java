package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367020 Largest prime factor of A000058(n) = A007018(n) + 1 (Sylvester's sequence).
 * @author Sean A. Irvine
 */
public class A367020 extends A000058 {

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
