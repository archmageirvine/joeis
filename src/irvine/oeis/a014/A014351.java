package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014351 Four-fold exponential convolution of primes with themselves (divided by 8).
 * @author Sean A. Irvine
 */
public class A014351 extends A014352 {

  @Override
  public Z next() {
    return super.next().shiftRight(3);
  }
}

