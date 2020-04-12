package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000491;

/**
 * A031128 Number of proper factorizations of <code>p1^n*p2^5</code>, where <code>p1</code> and <code>p2</code> are distinct primes.
 * @author Sean A. Irvine
 */
public class A031128 extends A000491 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

