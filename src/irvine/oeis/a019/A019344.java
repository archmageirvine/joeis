package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019344 Primes with primitive root 17.
 * @author Sean A. Irvine
 */
public class A019344 extends A019334 {

  private static final Z Z17 = Z.valueOf(17);

  @Override
  protected Z root() {
    return Z17;
  }
}

