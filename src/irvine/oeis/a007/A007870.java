package irvine.oeis.a007;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007870 Determinant of character table of symmetric group <code>S_n</code>.
 * @author Sean A. Irvine
 */
public class A007870 implements Sequence {

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
