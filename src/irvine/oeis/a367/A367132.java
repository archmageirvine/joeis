package irvine.oeis.a367;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367132 a(n) = phi(A000058(n)) where phi is the Euler totient function and A000058 is Sylvester's sequence.
 * @author Sean A. Irvine
 */
public class A367132 extends A000058 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
