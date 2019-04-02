package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019402 Primes with primitive root 79.
 * @author Sean A. Irvine
 */
public class A019402 extends A019334 {

  private static final Z Z79 = Z.valueOf(79);

  @Override
  protected Z root() {
    return Z79;
  }
}

