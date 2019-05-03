package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014346 Exponential convolution of primes with themselves (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A014346 extends A014345 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

