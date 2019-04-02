package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019416 Primes with primitive root 94.
 * @author Sean A. Irvine
 */
public class A019416 extends A019334 {

  private static final Z Z94 = Z.valueOf(94);

  @Override
  protected Z root() {
    return Z94;
  }
}

