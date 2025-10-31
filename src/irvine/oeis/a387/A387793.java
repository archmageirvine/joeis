package irvine.oeis.a387;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a389.A389524;

/**
 * A387793 a(n) = Sum_{k=1..floor(n/2)} A389524(n, n - 2*k + 1).
 * @author Sean A. Irvine
 */
public class A387793 extends A389524 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN / 2, k -> mB.get(mN, mN - 2 * k + 1));
  }
}

