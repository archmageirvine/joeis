package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;

/**
 * A052108 Number of self-complementary 5-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A052108 extends A052107 {

  // After Andrew Howroyd

  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 3) < 2) {
      if (mN == 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final IntegerPartition part = new IntegerPartition(mN / 4);
      int[] p;
      while ((p = part.next()) != null) {
        final Z t = IntegerPartition.permCount(p, 4).multiply(Z.SIX.pow(edges(p)));
        sum = sum.add(t.multiply((mN & 1) == 1 ? Z.SIX.pow(p.length).multiply(mN) : Z.ONE));
      }
      return sum.divide(Functions.FACTORIAL.z(mN));
    } else {
      return Z.ZERO;
    }
  }
}
