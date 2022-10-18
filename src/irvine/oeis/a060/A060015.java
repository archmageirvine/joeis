package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060015 Sum of orders of all even permutations of n letters.
 * @author Sean A. Irvine
 */
public class A060015 implements Sequence {

  private int mN = 0;

  private boolean isEven(final int[] p) {
    return (IntegerUtils.sum(p) & 1) != (p.length & 1);
  }

  @Override
  public Z next() {
    Z res = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      if (isEven(c)) {
        res = res.add(IntegerPartition.permCount(p, 1).multiply(IntegerUtils.lcm(p)));
      }
    }
    return res;
  }
}
