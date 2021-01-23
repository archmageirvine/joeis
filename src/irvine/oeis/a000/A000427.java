package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.MultidimensionalIntegerPartition;

/**
 * A000427 Number of 7-dimensional partitions of n.
 * @author Sean A. Irvine
 */
public class A000427 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 7).count());
  }
}

