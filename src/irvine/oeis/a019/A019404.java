package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019404 Primes with primitive root 82.
 * @author Sean A. Irvine
 */
public class A019404 extends A019334 {

  private static final Z Z82 = Z.valueOf(82);

  @Override
  protected Z root() {
    return Z82;
  }
}

