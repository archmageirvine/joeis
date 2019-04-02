package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019366 Primes with primitive root 41.
 * @author Sean A. Irvine
 */
public class A019366 extends A019334 {

  private static final Z Z41 = Z.valueOf(41);

  @Override
  protected Z root() {
    return Z41;
  }
}

