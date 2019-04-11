package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014348 Three-fold exponential convolution of primes with themselves (divided by 2).
 * @author Sean A. Irvine
 */
public class A014348 extends A014347 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

