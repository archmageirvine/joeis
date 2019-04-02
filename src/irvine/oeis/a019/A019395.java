package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019395 Primes with primitive root 72.
 * @author Sean A. Irvine
 */
public class A019395 extends A019334 {

  private static final Z Z72 = Z.valueOf(72);

  @Override
  protected Z root() {
    return Z72;
  }
}

