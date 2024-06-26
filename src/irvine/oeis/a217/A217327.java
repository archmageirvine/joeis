package irvine.oeis.a217;
// Generated by gen_seq4.pl anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007578;
import irvine.oeis.a007.A007579;

/**
 * A217327 Number of self-inverse permutations in S_n with longest increasing subsequence of length 7.
 * @author Georg Fischer
 */
public class A217327 extends AbstractSequence {

  private final A007578 mSeq1 = new A007578();
  private final A007579 mSeq2 = new A007579();

  /** Construct the sequence. */
  public A217327() {
    super(7);
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
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
