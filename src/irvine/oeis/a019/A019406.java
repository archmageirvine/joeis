package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019406 Primes with primitive root 84.
 * @author Sean A. Irvine
 */
public class A019406 extends A019334 {

  private static final Z Z84 = Z.valueOf(84);

  @Override
  protected Z root() {
    return Z84;
  }
}

