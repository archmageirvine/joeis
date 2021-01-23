package irvine.oeis.a061;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061259 a(n)=Sum_{d|n} d*numbpart(d), where numbpart(d)=number of partitions of d, cf. A000041.
 * @author Sean A. Irvine
 */
public class A061259 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      if (mN % d == 0) {
        s = s.add(IntegerPartition.partitions(d).multiply(d));
      }
    }
    return s;
  }
}
