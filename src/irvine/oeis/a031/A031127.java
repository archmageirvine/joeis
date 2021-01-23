package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000465;

/**
 * A031127 Number of proper factorizations of p1^n*p2^4, where p1 and p2 are distinct primes.
 * @author Sean A. Irvine
 */
public class A031127 extends A000465 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

