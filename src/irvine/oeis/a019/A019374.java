package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019374 Primes with primitive root 50.
 * @author Sean A. Irvine
 */
public class A019374 extends A019334 {

  private static final Z Z50 = Z.valueOf(50);

  @Override
  protected Z root() {
    return Z50;
  }
}

