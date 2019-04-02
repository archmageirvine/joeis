package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019409 Primes with primitive root 87.
 * @author Sean A. Irvine
 */
public class A019409 extends A019334 {

  private static final Z Z87 = Z.valueOf(87);

  @Override
  protected Z root() {
    return Z87;
  }
}

