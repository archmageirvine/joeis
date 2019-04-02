package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019383 Primes with primitive root 59.
 * @author Sean A. Irvine
 */
public class A019383 extends A019334 {

  private static final Z Z59 = Z.valueOf(59);

  @Override
  protected Z root() {
    return Z59;
  }
}

