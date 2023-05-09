package irvine.oeis.a318;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a211.A211779;

/**
 * A318445 a(n) = Sum_{d|n, d&lt;n} A005187(d).
 * @author Georg Fischer
 */
public class A318445 extends AbstractSequence {

  private A211779 mSeq1 = new A211779();
  private A318447 mSeq2 = new A318447();

  /** Construct the sequence. */
  public A318445() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
