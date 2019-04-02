package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019390 Primes with primitive root 67.
 * @author Sean A. Irvine
 */
public class A019390 extends A019334 {

  private static final Z Z67 = Z.valueOf(67);

  @Override
  protected Z root() {
    return Z67;
  }
}

