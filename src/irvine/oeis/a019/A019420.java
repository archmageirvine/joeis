package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019420 Primes with primitive root 98.
 * @author Sean A. Irvine
 */
public class A019420 extends A019334 {

  private static final Z Z98 = Z.valueOf(98);

  @Override
  protected Z root() {
    return Z98;
  }
}

