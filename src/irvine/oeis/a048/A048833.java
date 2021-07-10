package irvine.oeis.a048;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048833 Number of starting positions of Nim with 2n pieces such that 2nd player wins. Partitions of 2n such that xor-sum of partitions is 0.
 * @author Sean A. Irvine
 */
public class A048833 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(2 * mN);
    long c = 0;
    int[] p;
    while ((p = part.next()) != null) {
      int xor = 0;
      for (final int v : p) {
        xor ^= v;
      }
      if (xor == 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
