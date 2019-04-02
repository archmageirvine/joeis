package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019369 Primes with primitive root 44.
 * @author Sean A. Irvine
 */
public class A019369 extends A019334 {

  private static final Z Z44 = Z.valueOf(44);

  @Override
  protected Z root() {
    return Z44;
  }
}

