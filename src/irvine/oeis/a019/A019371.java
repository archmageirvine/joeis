package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019371 Primes with primitive root 46.
 * @author Sean A. Irvine
 */
public class A019371 extends A019334 {

  private static final Z Z46 = Z.valueOf(46);

  @Override
  protected Z root() {
    return Z46;
  }
}

