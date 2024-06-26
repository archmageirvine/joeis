package irvine.oeis.a225;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000578;
import irvine.oeis.a055.A055012;

/**
 * A225051 Numbers of the form x^3 + SumOfCubedDigits(x).
 * @author Georg Fischer
 */
public class A225051 extends AbstractSequence {

  private final A000578 mSeq1 = new A000578();
  private final A055012 mSeq2 = new A055012();

  /** Construct the sequence. */
  public A225051() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
