package irvine.oeis.a058;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058702 a(n) = p(n) if n &lt;= 4 else p(a(n-1)), where p = partition numbers A000041.
 * @author Sean A. Irvine
 */
public class A058702 extends A000041 {

  private int mN = -1;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mN <= 4) {
      mA = IntegerPartition.partitions(mN);
    } else {
      mA = IntegerPartition.partitions(mA.intValueExact());
    }
    return mA;
  }
}
