package irvine.oeis.a007;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007870 Determinant of character table of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A007870 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    if (++mN > 0) {
      final IntegerPartition part = new IntegerPartition(mN);
      int[] p;
      while ((p = part.next()) != null) {
        for (final int v : p) {
          prod = prod.multiply(v);
        }
      }
    }
    return prod;
  }
}
