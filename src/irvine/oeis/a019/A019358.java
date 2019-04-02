package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019358 Primes with primitive root 32.
 * @author Sean A. Irvine
 */
public class A019358 extends A019334 {

  private static final Z Z32 = Z.valueOf(32);

  @Override
  protected Z root() {
    return Z32;
  }
}

