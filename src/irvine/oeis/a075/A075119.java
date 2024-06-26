package irvine.oeis.a075;
// Generated by gen_seq4.pl anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000196;
import irvine.oeis.a067.A067815;

/**
 * A075119 Denominator of n/floor(sqrt(n)); numerator is A073890(n).
 * @author Georg Fischer
 */
public class A075119 extends AbstractSequence {

  private final A000196 mSeq1 = new A000196();
  private final A067815 mSeq2 = new A067815();

  /** Construct the sequence. */
  public A075119() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
