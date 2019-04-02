package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019363 Primes with primitive root 38.
 * @author Sean A. Irvine
 */
public class A019363 extends A019334 {

  private static final Z Z38 = Z.valueOf(38);

  @Override
  protected Z root() {
    return Z38;
  }
}

