package irvine.oeis.a000;

import irvine.math.partitions.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000390 Number of 5-dimensional partitions of n.
 * @author Sean A. Irvine
 */
public class A000390 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 5).count());
  }
}

