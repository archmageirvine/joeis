package irvine.oeis.a331;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001678;
import irvine.oeis.a001.A001679;

/**
 * A331488 Number of unlabeled lone-child-avoiding rooted trees with n vertices and more than two branches (of the root).
 * @author Georg Fischer
 */
public class A331488 extends AbstractSequence {

  private int mN = 0;
  private final A001679 mSeq1 = new A001679();
  private final A001678 mSeq2 = new A001678();

  /** Construct the sequence. */
  public A331488() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ZERO : result;
  }
}
