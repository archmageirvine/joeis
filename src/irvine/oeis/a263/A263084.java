package irvine.oeis.a263;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A263084 a(n) = A263086(n) - A263085(n).
 * @author Georg Fischer
 */
public class A263084 extends AbstractSequence {

  private A263086 mSeq1 = new A263086();
  private A263085 mSeq2 = new A263085();

  /** Construct the sequence. */
  public A263084() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
