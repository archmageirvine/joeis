package irvine.oeis.a364;
// Generated by gen_seq4.pl anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000073;
import irvine.oeis.a000.A000142;

/**
 * A364324 a(n) = n!*tribonacci(n+2).
 * @author Georg Fischer
 */
public class A364324 extends AbstractSequence {

  private final A000142 mSeq1 = new A000142();
  private final A000073 mSeq2 = new A000073();

  /** Construct the sequence. */
  public A364324() {
    super(0);
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
