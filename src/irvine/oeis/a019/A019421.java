package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019421 Primes with primitive root 99.
 * @author Sean A. Irvine
 */
public class A019421 extends A019334 {

  private static final Z Z99 = Z.valueOf(99);

  @Override
  protected Z root() {
    return Z99;
  }
}

