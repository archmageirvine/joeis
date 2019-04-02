package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019345 Primes with primitive root 18.
 * @author Sean A. Irvine
 */
public class A019345 extends A019334 {

  private static final Z Z18 = Z.valueOf(18);

  @Override
  protected Z root() {
    return Z18;
  }
}

