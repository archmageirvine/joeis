package irvine.oeis.a128;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006785;
import irvine.oeis.a006.A006787;

/**
 * A128237 Number of n-node (unlabeled) graphs with girth 4.
 * @author Georg Fischer
 */
public class A128237 extends AbstractSequence {

  private final A006785 mSeq1 = new A006785();
  private final A006787 mSeq2 = new A006787();

  /** Construct the sequence. */
  public A128237() {
    super(3);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
