package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a057.A057588;

/**
 * A064145.
 * @author Sean A. Irvine
 */
public class A366810 extends A057588 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
