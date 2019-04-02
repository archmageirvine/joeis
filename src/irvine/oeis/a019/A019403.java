package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019403 Primes with primitive root 80.
 * @author Sean A. Irvine
 */
public class A019403 extends A019334 {

  private static final Z Z80 = Z.valueOf(80);

  @Override
  protected Z root() {
    return Z80;
  }
}

