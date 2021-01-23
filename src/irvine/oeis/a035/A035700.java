package irvine.oeis.a035;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035700 Number of partitions of n is a multiple of 12.
 * @author Sean A. Irvine
 */
public class A035700 implements Sequence {

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

