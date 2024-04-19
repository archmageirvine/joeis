package irvine.oeis.a162;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001168;

/**
 * A162678 Number of fixed strictly disconnected n-ominoes bounded (not necessarily tightly) by an n*n square.
 * @author Georg Fischer
 */
public class A162678 extends AbstractSequence {

  private final A162676 mSeq1 = new A162676();
  private final A001168 mSeq2 = new A001168();

  /** Construct the sequence. */
  public A162678() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
