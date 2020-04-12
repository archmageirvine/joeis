package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a002.A002755;

/**
 * A031129 Number of proper factorizations of <code>p1^n*p2^6</code>, where <code>p1</code> and <code>p2</code> are distinct primes.
 * @author Sean A. Irvine
 */
public class A031129 extends A002755 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

