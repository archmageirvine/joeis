package irvine.oeis.a029;

import irvine.math.z.Z;

/**
 * A029708 Numbers k such that <code>k-2</code> and <code>k+2</code> are consecutive primes.
 * @author Sean A. Irvine
 */
public class A029708 extends A029710 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
