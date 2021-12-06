package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a052.A052188;

/**
 * A053072 Primes p such that p-12, p and p+12 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A053072 extends A052188 {

  @Override
  public Z next() {
    return super.next().add(12);
  }
}
