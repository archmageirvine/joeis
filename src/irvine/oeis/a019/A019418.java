package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019418 Primes with primitive root 96.
 * @author Sean A. Irvine
 */
public class A019418 extends A019334 {

  private static final Z Z96 = Z.valueOf(96);

  @Override
  protected Z root() {
    return Z96;
  }
}

