package irvine.oeis.a000;

import irvine.math.partitions.MultidimensionalIntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000416 Number of 6-dimensional partitions of n.
 * @author Sean A. Irvine
 */
public class A000416 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 6).count());
  }
}

