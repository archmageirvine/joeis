package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019350 Primes with primitive root 23.
 * @author Sean A. Irvine
 */
public class A019350 extends A019334 {

  private static final Z Z23 = Z.valueOf(23);

  @Override
  protected Z root() {
    return Z23;
  }
}

