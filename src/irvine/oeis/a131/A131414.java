package irvine.oeis.a131;
// Generated by gen_seq4.pl trisum/trisum3 at 2023-06-07 16:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a130.A130302;
import irvine.oeis.a130.A130303;

/**
 * A131414 A130302 + A130303 - A000012.
 * @author Georg Fischer
 */
public class A131414 extends AbstractSequence {

  private final long mFactor1 = 1;
  private final long mFactor2 = +1;
  private final long mFactor3 = -1;
  private final A130302 mSeq1 = new A130302();
  private final A130303 mSeq2 = new A130303();
  private final A000012 mSeq3 = new A000012();

  /** Construct the sequence. */
  public A131414() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2)).add(mSeq3.next().multiply(mFactor3));
  }
}
