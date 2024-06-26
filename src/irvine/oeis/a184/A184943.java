package irvine.oeis.a184;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006820;
import irvine.oeis.a033.A033886;

/**
 * A184943 Number of connected 4-regular simple graphs on n vertices with girth exactly 3.
 * @author Georg Fischer
 */
public class A184943 extends AbstractSequence {

  private final A006820 mSeq1 = new A006820();
  private final A033886 mSeq2 = new A033886();

  /** Construct the sequence. */
  public A184943() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
