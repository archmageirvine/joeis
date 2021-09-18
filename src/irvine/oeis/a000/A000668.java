package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000668 Mersenne primes (primes of the form 2^n - 1).
 * @author Sean A. Irvine
 */
public class A000668 extends A000043 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValue()).subtract(1);
  }
}
