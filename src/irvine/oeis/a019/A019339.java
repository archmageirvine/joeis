package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019339 Primes with primitive root 11.
 * @author Sean A. Irvine
 */
public class A019339 extends A019334 {

  private static final Z Z11 = Z.valueOf(11);

  @Override
  protected Z root() {
    return Z11;
  }
}

