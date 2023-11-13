package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367130 a(n) is the number of divisors of A000058(n) (Sylvester's sequence).
 * @author Sean A. Irvine
 */
public class A367130 extends A000058 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
