package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019375 Primes with primitive root 51.
 * @author Sean A. Irvine
 */
public class A019375 extends A019334 {

  private static final Z Z51 = Z.valueOf(51);

  @Override
  protected Z root() {
    return Z51;
  }
}

