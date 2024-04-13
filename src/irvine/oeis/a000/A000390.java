package irvine.oeis.a000;

import irvine.math.partition.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000390 Number of 5-dimensional partitions of n.
 * @author Sean A. Irvine
 */
public class A000390 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 5).count());
  }
}

