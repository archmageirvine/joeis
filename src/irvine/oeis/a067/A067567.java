package irvine.oeis.a067;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067567 Odd numbers with an odd number of partitions.
 * @author Sean A. Irvine
 */
public class A067567 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (IntegerPartition.partitions(mN).isOdd()) {
        return Z.valueOf(mN);
      }
    }
  }
}

