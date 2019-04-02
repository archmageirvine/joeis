package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019396 Primes with primitive root 73.
 * @author Sean A. Irvine
 */
public class A019396 extends A019334 {

  private static final Z Z73 = Z.valueOf(73);

  @Override
  protected Z root() {
    return Z73;
  }
}

