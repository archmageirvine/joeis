package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019408 Primes with primitive root 86.
 * @author Sean A. Irvine
 */
public class A019408 extends A019334 {

  private static final Z Z86 = Z.valueOf(86);

  @Override
  protected Z root() {
    return Z86;
  }
}

