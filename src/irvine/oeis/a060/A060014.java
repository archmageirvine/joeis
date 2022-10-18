package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060014 Sum of orders of all permutations of n letters.
 * @author Sean A. Irvine
 */
public class A060014 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      res = res.add(IntegerPartition.permCount(p, 1).multiply(IntegerUtils.lcm(p)));
    }
    return res;
  }
}
