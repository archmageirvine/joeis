package irvine.oeis.a002;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002838.
 * @author Sean A. Irvine
 */
public class A002838 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int pn = mN * (mN + 1) / 2;
    long c = 0;
    final IntegerPartition part = new IntegerPartition(pn);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= mN && p[0] <= mN + 1) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

