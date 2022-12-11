package irvine.oeis.a064;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a001.A001522;

/**
 * A064428 Number of partitions of n with nonnegative crank.
 * @author Georg Fischer
 */
public class A064428 extends AbstractSequence {

  private int mN = -1;
  private A000041 mSeq1 = new A000041();
  private A001522 mSeq2 = new A001522();

  /** Construct the sequence. */
  public A064428() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN <= 0) ? Z.ONE : result;
  }
}
