package irvine.oeis.a367;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A367020.
 * @author Sean A. Irvine
 */
public class A367132 extends A000058 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
