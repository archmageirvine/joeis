package irvine.oeis.a131;
// Generated by gen_seq4.pl trisum/trisum4 at 2023-06-07 16:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000012;
import irvine.oeis.a002.A002024;
import irvine.oeis.a007.A007318;

/**
 * A131950 A002024 + A131821 + A007318 - 2*A000012 as infinite lower triangular matrices.
 * @author Georg Fischer
 */
public class A131950 extends AbstractSequence {

  private final long mFactor1 = 1;
  private final long mFactor2 = +1;
  private final long mFactor3 = +1;
  private final long mFactor4 = -2;
  private final A002024 mSeq1 = new A002024();
  private final A131821 mSeq2 = new A131821();
  private final A007318 mSeq3 = new A007318();
  private final A000012 mSeq4 = new A000012();

  /** Construct the sequence. */
  public A131950() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2)).add(mSeq3.next().multiply(mFactor3)).add(mSeq4.next().multiply(mFactor4));
  }
}
