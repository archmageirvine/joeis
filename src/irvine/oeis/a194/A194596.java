package irvine.oeis.a194;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000105;
import irvine.oeis.a030.A030222;

/**
 * A194596 Number of free polyplets with n cells that are not polyominoes.
 * @author Georg Fischer
 */
public class A194596 extends AbstractSequence {

  private final A030222 mSeq1 = new A030222();
  private final A000105 mSeq2 = new A000105();

  /** Construct the sequence. */
  public A194596() {
    super(1);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
