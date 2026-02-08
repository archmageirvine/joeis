package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083670 Number of different antisymmetric relations on n unlabeled points.
 * @author Sean A. Irvine
 */
public class A083670 extends Sequence0 {

  // After Andrew Howroyd

  private int mN = -1;

  private int edges(final int[] v) {
    int s = 0;
    for (int i = 1; i < v.length; ++i) {
      for (int j = 0; j < i; ++j) {
        s += Functions.GCD.l(v[i], v[j]);
      }
    }
    for (final int j : v) {
      s += (j - 1) / 2;
    }
    return s;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      sum = sum.add(IntegerPartition.permCount(p).multiply(Z.THREE.pow(edges(p)).shiftLeft(p.length)));
    }
    return sum.divide(Functions.FACTORIAL.z(mN));
  }
}
