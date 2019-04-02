package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019377 Primes with primitive root 53.
 * @author Sean A. Irvine
 */
public class A019377 extends A019334 {

  private static final Z Z53 = Z.valueOf(53);

  @Override
  protected Z root() {
    return Z53;
  }
}

