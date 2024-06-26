package irvine.oeis.a217;
// Generated by gen_seq4.pl anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a072.A072133;

/**
 * A217677 Number of permutations in S_n containing an increasing subsequence of length 10.
 * @author Georg Fischer
 */
public class A217677 extends AbstractSequence {

  private final A000142 mSeq1 = new A000142();
  private final A072133 mSeq2 = new A072133();

  /** Construct the sequence. */
  public A217677() {
    super(10);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
