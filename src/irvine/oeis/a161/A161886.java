package irvine.oeis.a161;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006218;

/**
 * A161886 Number of nonzero elements in the n X n Redheffer matrix.
 * @author Georg Fischer
 */
public class A161886 extends AbstractSequence {

  private A006218 mSeq1 = new A006218();
  private long mN;

  /** Construct the sequence. */
  public A161886() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().add(mN - 1);
  }
}
