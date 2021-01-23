package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000291;

/**
 * A031125 Number of proper factorizations of p1^n*p2^2, where p1 and p2 are distinct primes.
 * @author Sean A. Irvine
 */
public class A031125 extends A000291 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

