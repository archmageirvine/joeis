package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019407 Primes with primitive root 85.
 * @author Sean A. Irvine
 */
public class A019407 extends A019334 {

  private static final Z Z85 = Z.valueOf(85);

  @Override
  protected Z root() {
    return Z85;
  }
}

