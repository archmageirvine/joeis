package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019411 Primes with primitive root 89.
 * @author Sean A. Irvine
 */
public class A019411 extends A019334 {

  private static final Z Z89 = Z.valueOf(89);

  @Override
  protected Z root() {
    return Z89;
  }
}

