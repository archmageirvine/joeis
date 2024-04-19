package irvine.oeis.a064;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001522;

/**
 * A064410 Number of partitions of n with zero crank.
 * @author Georg Fischer
 */
public class A064410 extends AbstractSequence {

  private int mN = 0;
  private final A064428 mSeq1 = new A064428();
  private final A001522 mSeq2 = new A001522();

  /** Construct the sequence. */
  public A064410() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ZERO : result;
  }
}
