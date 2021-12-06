package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052190;

/**
 * A053074 Primes p such that p-24, p and p+24 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A053074 extends A052190 {

  @Override
  public Z next() {
    return super.next().add(24);
  }
}
