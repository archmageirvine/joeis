package irvine.oeis.a124;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a029.A029931;
import irvine.oeis.a070.A070939;

/**
 * A124757 Zero-based weighted sum of compositions in standard order.
 * @author Georg Fischer
 */
public class A124757 extends AbstractSequence {

  private int mN = -1;
  private A029931 mSeq1 = new A029931();
  private A070939 mSeq2 = new A070939();

  /** Construct the sequence. */
  public A124757() {
    super(0);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 0) ? Z.ZERO : result;
  }
}
