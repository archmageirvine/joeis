package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019351 Primes with primitive root 24.
 * @author Sean A. Irvine
 */
public class A019351 extends A019334 {

  private static final Z Z24 = Z.valueOf(24);

  @Override
  protected Z root() {
    return Z24;
  }
}

