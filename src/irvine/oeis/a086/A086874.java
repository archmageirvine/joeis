package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A086874 Seventh power of odd primes.
 *
 * @author Karsten Knuth
 */
public class A086874 extends A065091 {
  @Override
  public Z next() {
    return super.next().pow(7);
  }
}
