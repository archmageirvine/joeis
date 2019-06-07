package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.MultidimensionalIntegerPartition;

/**
 * A000390 Number of 5-dimensional partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000390 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 5).count());
  }
}

