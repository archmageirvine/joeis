package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;

/**
 * A007421 Liouville's function: parity of number of primes dividing n (with multiplicity).
 * @author Sean A. Irvine
 */
public class A007421 extends A001222 {

  @Override
  public Z next() {
    return Z.TWO.subtract(Z.ONE.and(super.next()));
  }
}

