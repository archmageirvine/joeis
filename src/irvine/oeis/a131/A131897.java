package irvine.oeis.a131;
// Generated by gen_seq4.pl trisum/trisum3 at 2023-06-07 16:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a130.A130321;

/**
 * A131897 A130321 + A131821 - A000012.
 * @author Georg Fischer
 */
public class A131897 extends AbstractSequence {

  private final long mFactor1 = 1;
  private final long mFactor2 = +1;
  private final long mFactor3 = -1;
  private final A130321 mSeq1 = new A130321();
  private final A131821 mSeq2 = new A131821();
  private final A000012 mSeq3 = new A000012();

  /** Construct the sequence. */
  public A131897() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2)).add(mSeq3.next().multiply(mFactor3));
  }
}
