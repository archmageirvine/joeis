package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019419 Primes with primitive root 97.
 * @author Sean A. Irvine
 */
public class A019419 extends A019334 {

  private static final Z Z97 = Z.valueOf(97);

  @Override
  protected Z root() {
    return Z97;
  }
}

