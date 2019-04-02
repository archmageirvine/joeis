package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019401 Primes with primitive root 78.
 * @author Sean A. Irvine
 */
public class A019401 extends A019334 {

  private static final Z Z78 = Z.valueOf(78);

  @Override
  protected Z root() {
    return Z78;
  }
}

