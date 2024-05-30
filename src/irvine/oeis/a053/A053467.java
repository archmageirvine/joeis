package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a052.A052107;

/**
 * A053467 Number of directed 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053467 extends A052107 {

  // After Andrew Howroyd

  private int mN = 0;

  @Override
  protected int edges(final int[] v) {
    int sum = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        sum += 2 * Functions.GCD.i(v[i], v[j]);
      }
    }
    for (final int j : v) {
      sum += j - 1;
    }
    return sum;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      final Z t = IntegerPartition.permCount(p, 1).multiply(Z.THREE.pow(edges(p)));
      sum = sum.add(t);
    }
    return sum.divide(Functions.FACTORIAL.z(mN));
  }
}
