package irvine.oeis.a389;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A389573 a(n) = Sum_{k=1..floor((n+1)/2)} A389524(n, n - 2*k + 2).
 * @author Sean A. Irvine
 */
public class A389573 extends A389524 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, (++mN + 1) / 2, k -> mB.get(mN, mN - 2 * k + 2));
  }
}

