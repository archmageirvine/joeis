package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000412;

/**
 * A031126 Number of proper factorizations of p1^n*p2^3, where p1 and p2 are distinct primes.
 * @author Sean A. Irvine
 */
public class A031126 extends A000412 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

