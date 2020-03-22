package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030078 Cubes of primes.
 * @author Sean A. Irvine
 */
public class A030078 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
