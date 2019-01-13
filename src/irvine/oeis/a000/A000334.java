package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.MultidimensionalIntegerPartition;

/**
 * A000334.
 * @author Sean A. Irvine
 */
public class A000334 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(new MultidimensionalIntegerPartition(++mN, 4).count());
  }
}

