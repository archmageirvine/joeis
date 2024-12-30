package irvine.oeis.a002;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002838 Balancing weights on the integer line.
 * @author Sean A. Irvine
 */
public class A002838 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int pn = mN * (mN + 1) / 2;
    long c = 0;
    final IntegerPartition part = new IntegerPartition(pn, mN + 1);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length <= mN) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

