package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019379 Primes with primitive root 55.
 * @author Sean A. Irvine
 */
public class A019379 extends A019334 {

  private static final Z Z55 = Z.valueOf(55);

  @Override
  protected Z root() {
    return Z55;
  }
}

