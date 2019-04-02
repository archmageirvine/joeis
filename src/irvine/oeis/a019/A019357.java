package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019357 Primes with primitive root 31.
 * @author Sean A. Irvine
 */
public class A019357 extends A019334 {

  private static final Z Z31 = Z.valueOf(31);

  @Override
  protected Z root() {
    return Z31;
  }
}

