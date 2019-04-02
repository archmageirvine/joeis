package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019337 Primes with primitive root 7.
 * @author Sean A. Irvine
 */
public class A019337 extends A019334 {

  @Override
  protected Z root() {
    return Z.SEVEN;
  }
}

