package irvine.oeis.a255;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000225;
import irvine.oeis.a060.A060957;

/**
 * A255962 Number of repeating products of any subset of {1, 2, 3, ..., n}.
 * @author Georg Fischer
 */
public class A255962 extends AbstractSequence {

  private final A000225 mSeq1 = new A000225();
  private final A060957 mSeq2 = new A060957();

  /** Construct the sequence. */
  public A255962() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
