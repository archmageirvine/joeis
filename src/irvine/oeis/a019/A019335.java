package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019335 Primes with primitive root 5.
 * @author Sean A. Irvine
 */
public class A019335 extends A019334 {

  @Override
  protected Z root() {
    return Z.FIVE;
  }
}

