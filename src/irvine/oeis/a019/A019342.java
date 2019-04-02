package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019342 Primes with primitive root 14.
 * @author Sean A. Irvine
 */
public class A019342 extends A019334 {

  private static final Z Z14 = Z.valueOf(14);

  @Override
  protected Z root() {
    return Z14;
  }
}

