package irvine.oeis.a067;

import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067554 Number of partitions of n in which the product of parts is a power of n.
 * @author Sean A. Irvine
 */
public class A067554 extends Sequence0 {

  private int mN = -1;

  private boolean is(final int[] p) {
    Z prod = IntegerUtils.product(p);
    while (!Z.ONE.equals(prod)) {
      if (prod.mod(mN) != 0) {
        return false;
      }
      prod = prod.divide(mN);
    }
    return true;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    long cnt = 0;
    while ((p = part.next()) != null) {
      if (is(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
