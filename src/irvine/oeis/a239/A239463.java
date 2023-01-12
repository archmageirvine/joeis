package irvine.oeis.a239;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A239463 a(n) = A239460(n) / n^2.
 * @author Georg Fischer
 */
public class A239463 extends AbstractSequence {

  private A239460 mSeq1 = new A239460();
  private long mN;

  /** Construct the sequence. */
  public A239463() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().divide(mN * mN);
  }
}
