package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060178 Sum of orders of all odd permutations of n letters.
 * @author Sean A. Irvine
 */
public class A060178 extends Sequence1 {

  private int mN = 0;

  private boolean isOdd(final int[] p) {
    return (Functions.SUM.l(p) & 1) == (p.length & 1);
  }

  @Override
  public Z next() {
    Z res = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      if (isOdd(c)) {
        res = res.add(IntegerPartition.permCount(p, 1).multiply(IntegerUtils.lcm(p)));
      }
    }
    return res;
  }
}
