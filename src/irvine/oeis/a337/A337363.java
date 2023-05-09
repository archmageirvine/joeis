package irvine.oeis.a337;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;

/**
 * A337363 a(n) = Sum_{d1|n, d2|n, d1&lt;d2} (1 - [d1 + 1 = d2]), where [ ] is the Iverson bracket.
 * @author Georg Fischer
 */
public class A337363 extends AbstractSequence {

  private A337362 mSeq1 = new A337362();
  private A000005 mSeq2 = new A000005();

  /** Construct the sequence. */
  public A337363() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
