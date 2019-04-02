package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019387 Primes with primitive root 63.
 * @author Sean A. Irvine
 */
public class A019387 extends A019334 {

  private static final Z Z63 = Z.valueOf(63);

  @Override
  protected Z root() {
    return Z63;
  }
}

