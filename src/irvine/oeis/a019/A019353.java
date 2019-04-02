package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019353 Primes with primitive root 27.
 * @author Sean A. Irvine
 */
public class A019353 extends A019334 {

  private static final Z Z27 = Z.valueOf(27);

  @Override
  protected Z root() {
    return Z27;
  }
}

