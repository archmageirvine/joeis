package irvine.oeis.a240;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A240545.
 * @author Sean A. Irvine
 */
public class A240545 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (IntegerPartition.partitions(++k).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
