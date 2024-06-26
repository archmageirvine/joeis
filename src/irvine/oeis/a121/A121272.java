package irvine.oeis.a121;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000568;
import irvine.oeis.a000.A000570;

/**
 * A121272 Number of outcomes of unlabeled n-team round-robin tournaments that are not uniquely defined by their score vectors.
 * @author Georg Fischer
 */
public class A121272 extends AbstractSequence {

  private final A000568 mSeq1 = new A000568();
  private final A000570 mSeq2 = new A000570();

  /** Construct the sequence. */
  public A121272() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
