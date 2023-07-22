package irvine.oeis.a165;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a061.A061037;

/**
 * A165342 a(n) = A061037(n+2)/A000265(n+4).
 * @author Georg Fischer
 */
public class A165342 extends AbstractSequence {

  private final A061037 mSeq1 = new A061037();
  private final A000265 mSeq2 = new A000265();

  /** Construct the sequence. */
  public A165342() {
    super(0);
    mSeq2.skip(3);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }

}
