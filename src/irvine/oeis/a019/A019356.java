package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019356 Primes with primitive root 30.
 * @author Sean A. Irvine
 */
public class A019356 extends A019334 {

  private static final Z Z30 = Z.valueOf(30);

  @Override
  protected Z root() {
    return Z30;
  }
}

