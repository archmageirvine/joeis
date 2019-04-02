package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019400 Primes with primitive root 77.
 * @author Sean A. Irvine
 */
public class A019400 extends A019334 {

  private static final Z Z77 = Z.valueOf(77);

  @Override
  protected Z root() {
    return Z77;
  }
}

