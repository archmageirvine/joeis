package irvine.oeis.a327;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001349;
import irvine.oeis.a002.A002494;

/**
 * A327075 Number of non-connected unlabeled simple graphs covering n vertices.
 * @author Georg Fischer
 */
public class A327075 extends AbstractSequence {

  private int mN = -1;
  private A002494 mSeq1 = new A002494();
  private A001349 mSeq2 = new A001349();

  /** Construct the sequence. */
  public A327075() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN <= 1) ? Z.valueOf(1 - mN) : result;
  }
}
