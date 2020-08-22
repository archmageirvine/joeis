package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a002.A002756;

/**
 * A031130 Number of proper factorizations of p1^n*p2^7, where p1 and p2 are distinct primes.
 * @author Sean A. Irvine
 */
public class A031130 extends A002756 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

