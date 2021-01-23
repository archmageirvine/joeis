package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029708 Numbers k such that k-2 and k+2 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A029708 extends A029710 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
