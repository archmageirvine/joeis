package irvine.oeis.a217;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000055;
import irvine.oeis.a000.A000081;

/**
 * A217420 Number of rooted unlabeled trees where the root node has degree 2 and both branches are distinct.
 * @author Georg Fischer
 */
public class A217420 extends AbstractSequence {

  private int mN = 0;
  private final A000081 mSeq1 = new A000081();
  private final A000055 mSeq2 = new A000055();

  /** Construct the sequence. */
  public A217420() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ZERO : result;
  }
}
