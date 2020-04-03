package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030516 Numbers with 7 divisors. 6th powers of primes.
 * @author Sean A. Irvine
 */
public class A030516 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(6);
  }
}

