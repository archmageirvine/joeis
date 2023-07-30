package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A064822 Number of indices 1 &lt;= i &lt;= n with A001113(i)=A001113(n).
 * @author Sean A. Irvine
 */
public class A064822 extends A001113 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    return Z.valueOf(++mCounts[super.next().intValue()]);
  }
}
