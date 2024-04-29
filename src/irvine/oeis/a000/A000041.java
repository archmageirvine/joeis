package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000041 a(n) is the number of partitions of n (the partition numbers).
 * @author Sean A. Irvine
 */
public class A000041 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000041(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000041() {
    super(0);
  }

  protected int mN = -1;

  @Override
  public Z next() {
    final int index = ++mN;
    return Functions.PARTITIONS.z(index);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PARTITIONS.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PARTITIONS.z(n);
  }

}

