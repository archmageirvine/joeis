package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019364 Primes with primitive root 39.
 * @author Sean A. Irvine
 */
public class A019364 extends A019334 {

  private static final Z Z39 = Z.valueOf(39);

  @Override
  protected Z root() {
    return Z39;
  }
}

