package irvine.oeis.a316;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a002.A002805;

/**
 * A316297 a(n) = n! times the denominator of the n-th harmonic number H(n).
 * @author Georg Fischer
 */
public class A316297 extends AbstractSequence {

  private final A000142 mSeq1 = new A000142();
  private final A002805 mSeq2 = new A002805();

  /** Construct the sequence. */
  public A316297() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
