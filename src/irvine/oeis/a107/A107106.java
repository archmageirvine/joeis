package irvine.oeis.a107;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036039;
import irvine.oeis.a036.A036040;

/**
 * A107106 Divide A036039(n) by A036040(n).
 * @author Georg Fischer
 */
public class A107106 extends AbstractSequence {

  private final A036039 mSeq1 = new A036039();
  private final A036040 mSeq2 = new A036040();

  /** Construct the sequence. */
  public A107106() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
