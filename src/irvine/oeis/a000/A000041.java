package irvine.oeis.a000;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000041 a(n) is the number of partitions of n (the partition numbers).
 * @author Sean A. Irvine
 */
public class A000041 extends AbstractSequence {

  /* Construct the sequence. */
  public A000041() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    return IntegerPartition.partitions(++mN);
  }
}

