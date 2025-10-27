package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A389526 a(n) = Sum_{k &gt;= 1} A389524(n, 2*k - 1).
 * @author Sean A. Irvine
 */
public class A389526 extends A389524 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN / 2 + 1, k -> mB.get(mN, 2 * k - 1));
  }
}

