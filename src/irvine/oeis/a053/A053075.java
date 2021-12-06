package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052195;

/**
 * A053075 Primes p such that p-30, p, p+30 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A053075 extends A052195 {

  @Override
  public Z next() {
    return super.next().add(30);
  }
}
