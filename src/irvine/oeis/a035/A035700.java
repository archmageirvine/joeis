package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035700 Numbers k such that the number of partitions of k, A000041(k), is a multiple of 12.
 * @author Sean A. Irvine
 */
public class A035700 extends Sequence1 {

  private int mN = 20;

  @Override
  public Z next() {
    while (true) {
      if (IntegerPartition.partitions(++mN).mod(12) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

