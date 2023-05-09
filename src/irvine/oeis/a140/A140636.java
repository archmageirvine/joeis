package irvine.oeis.a140;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a005.A005703;

/**
 * A140636 Number of connected graphs on n unlabeled nodes that contain at least two cycles.
 * @author Georg Fischer
 */
public class A140636 extends AbstractSequence {

  private A001349 mSeq1 = new A001349();
  private A005703 mSeq2 = new A005703();

  /** Construct the sequence. */
  public A140636() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
