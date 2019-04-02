package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019355 Primes with primitive root 29.
 * @author Sean A. Irvine
 */
public class A019355 extends A019334 {

  private static final Z Z29 = Z.valueOf(29);

  @Override
  protected Z root() {
    return Z29;
  }
}

