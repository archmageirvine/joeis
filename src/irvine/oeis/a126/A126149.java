package irvine.oeis.a126;
// manually anopan 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a003.A003216;

/**
 * A126149 Number of connected nonhamiltonian graphs with n nodes.
 * @author Georg Fischer
 */
public class A126149 extends AbstractSequence {

  private A001349 mSeq1 = new A001349();
  private A003216 mSeq2 = new A003216();

  /** Construct the sequence. */
  public A126149() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
