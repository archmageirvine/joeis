package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019380 Primes with primitive root 56.
 * @author Sean A. Irvine
 */
public class A019380 extends A019334 {

  private static final Z Z56 = Z.valueOf(56);

  @Override
  protected Z root() {
    return Z56;
  }
}

