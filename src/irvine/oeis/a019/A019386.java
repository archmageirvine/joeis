package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019386 Primes with primitive root 62.
 * @author Sean A. Irvine
 */
public class A019386 extends A019334 {

  private static final Z Z62 = Z.valueOf(62);

  @Override
  protected Z root() {
    return Z62;
  }
}

