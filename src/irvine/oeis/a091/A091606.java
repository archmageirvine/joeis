package irvine.oeis.a091;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000726;
import irvine.oeis.a001.A001935;

/**
 * A091606 Column 3 of triangle A091602.
 * @author Georg Fischer
 */
public class A091606 extends AbstractSequence {

  private final A001935 mSeq1 = new A001935();
  private final A000726 mSeq2 = new A000726();

  /** Construct the sequence. */
  public A091606() {
    super(3);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
