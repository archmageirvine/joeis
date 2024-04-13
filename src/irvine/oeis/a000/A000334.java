package irvine.oeis.a000;

import irvine.math.partition.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000334 Number of 4-dimensional partitions of n.
 * @author Sean A. Irvine
 */
public class A000334 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 4).count());
  }
}

