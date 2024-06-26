package irvine.oeis.a200;
// Generated by gen_seq4.pl anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000129;
import irvine.oeis.a001.A001006;

/**
 * A200540 Product of Pell and Motzkin numbers: a(n) = A000129(n+1)*A001006(n).
 * @author Georg Fischer
 */
public class A200540 extends AbstractSequence {

  private final A000129 mSeq1 = new A000129();
  private final A001006 mSeq2 = new A001006();

  /** Construct the sequence. */
  public A200540() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
