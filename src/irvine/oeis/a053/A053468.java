package irvine.oeis.a053;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A053468 Number of directed 3-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053468 extends A053467 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      final Z t = IntegerPartition.permCount(p, 1).shiftLeft(2 * edges(p));
      sum = sum.add(t);
    }
    return sum.divide(mF.factorial(mN));
  }
}
