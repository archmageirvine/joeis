package irvine.oeis.a323;
// manually trafo

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003465;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A323818 Number of connected set-systems covering n vertices.
 * @author Georg Fischer
 */
public class A323818 extends AbstractSequence {

  private int mN = -1;
  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A003465(), 1);

  /** Construct the sequence. */
  public A323818() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next();
  }
}
