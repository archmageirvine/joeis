package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031216 Write primes in base 10 but interpret as if in base 11.
 * @author Sean A. Irvine
 */
public class A031216 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 11);
  }
}
