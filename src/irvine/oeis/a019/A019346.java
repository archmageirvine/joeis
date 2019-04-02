package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019346 Primes with primitive root 19.
 * @author Sean A. Irvine
 */
public class A019346 extends A019334 {

  private static final Z Z19 = Z.valueOf(19);

  @Override
  protected Z root() {
    return Z19;
  }
}

