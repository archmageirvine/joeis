package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057750 Number of non-factorable subsets of size &gt;= 2 of a 1 X n uniform grid.
 * @author Sean A. Irvine
 */
public class A057750 extends A057765 {

  @Override
  public Z next() {
    final long cnt = super.next().longValueExact();
    return Z.valueOf((1L << mN) - (mN + 1) - cnt);
  }
}
