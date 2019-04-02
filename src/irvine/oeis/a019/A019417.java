package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019417 Primes with primitive root 95.
 * @author Sean A. Irvine
 */
public class A019417 extends A019334 {

  private static final Z Z95 = Z.valueOf(95);

  @Override
  protected Z root() {
    return Z95;
  }
}

