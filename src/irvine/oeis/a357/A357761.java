package irvine.oeis.a357;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a227.A227872;
import irvine.oeis.a356.A356018;

/**
 * A357761 a(n) = A227872(n) - A356018(n).
 * @author Georg Fischer
 */
public class A357761 extends AbstractSequence {

  private final A227872 mSeq1 = new A227872();
  private final A356018 mSeq2 = new A356018();

  /** Construct the sequence. */
  public A357761() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
