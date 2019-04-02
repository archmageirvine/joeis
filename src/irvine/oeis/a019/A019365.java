package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019365 Primes with primitive root 40.
 * @author Sean A. Irvine
 */
public class A019365 extends A019334 {

  private static final Z Z40 = Z.valueOf(40);

  @Override
  protected Z root() {
    return Z40;
  }
}

