package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A064823 Number of indices 1 &lt;= i &lt;= n with A000796(i)=A000796(n).
 * @author Sean A. Irvine
 */
public class A064823 extends A000796 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    return Z.valueOf(++mCounts[super.next().intValue()]);
  }
}
