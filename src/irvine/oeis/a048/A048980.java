package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048980 Difference between number of nonprimes and primes in reduced residue system of primorial numbers.
 * @author Sean A. Irvine
 */
public class A048980 extends A048863 {

  private final Sequence mA = new A048862();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
