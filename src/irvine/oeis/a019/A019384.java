package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019384 Primes with primitive root 60.
 * @author Sean A. Irvine
 */
public class A019384 extends A019334 {

  private static final Z Z60 = Z.valueOf(60);

  @Override
  protected Z root() {
    return Z60;
  }
}

