package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019373 Primes with primitive root 48.
 * @author Sean A. Irvine
 */
public class A019373 extends A019334 {

  private static final Z Z48 = Z.valueOf(48);

  @Override
  protected Z root() {
    return Z48;
  }
}

