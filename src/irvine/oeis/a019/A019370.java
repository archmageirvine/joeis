package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019370 Primes with primitive root 45.
 * @author Sean A. Irvine
 */
public class A019370 extends A019334 {

  private static final Z Z45 = Z.valueOf(45);

  @Override
  protected Z root() {
    return Z45;
  }
}

