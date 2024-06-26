package irvine.oeis.a230;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A230235 Number of permutations of [n] in which the longest increasing run has length 9.
 * @author Georg Fischer
 */
public class A230235 extends AbstractSequence {

  private final A230232 mSeq1 = new A230232();
  private final A230231 mSeq2 = new A230231();

  /** Construct the sequence. */
  public A230235() {
    super(9);
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
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
