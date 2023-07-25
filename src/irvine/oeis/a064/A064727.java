package irvine.oeis.a064;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064727 Number of pairs x,y such that 0 &lt; x &lt;= y &lt; n and x+y = n and x*y = kn for some k.
 * @author Sean A. Irvine
 */
public class A064727 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN / 2, k -> Z.ONE.subtract(((long) k * (mN - k) + mN - 1) / mN).add((long) k * (mN - k) / mN));
  }
}
