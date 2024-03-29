package irvine.oeis.a131;
// Generated by gen_seq4.pl trisum/trisum2 at 2023-06-07 16:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000012;

/**
 * A131843 Triangle read by rows: 2*A131821 - A000012.
 * @author Georg Fischer
 */
public class A131843 extends AbstractSequence {

  private final long mFactor1 = 2;
  private final long mFactor2 = -1;
  private final A131821 mSeq1 = new A131821();
  private final A000012 mSeq2 = new A000012();

  /** Construct the sequence. */
  public A131843() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2));
  }
}
