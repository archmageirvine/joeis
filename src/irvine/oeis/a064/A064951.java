package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a051.A051193;

/**
 * A064951 a(n) = Sum_{1 &lt;= x, y &lt;= n} lcm(x, y).
 * @author Sean A. Irvine
 */
public class A064951 extends A051193 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().multiply2().subtract(mN));
    return mSum;
  }
}
