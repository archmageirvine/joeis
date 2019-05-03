package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000668 Mersenne primes (of form <code>2^p - 1</code> where p is a prime).
 * @author Sean A. Irvine
 */
public class A000668 extends A000043 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue()).subtract(1);
  }
}
