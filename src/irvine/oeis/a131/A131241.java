package irvine.oeis.a131;
// Generated by gen_seq4.pl trisum/trisum2 at 2023-06-07 16:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023531;
import irvine.oeis.a046.A046854;

/**
 * A131241 3*A046854 - 2*I.
 * @author Georg Fischer
 */
public class A131241 extends AbstractSequence {

  private final long mFactor1 = 3;
  private final long mFactor2 = -2;
  private final A046854 mSeq1 = new A046854();
  private final A023531 mSeq2 = new A023531();

  /** Construct the sequence. */
  public A131241() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2));
  }
}
