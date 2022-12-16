package irvine.oeis.a357;
// manually anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023359;
import irvine.oeis.a209.A209229;

/**
 * A357534 Number of compositions (ordered partitions) of n into two or more powers of 2.
 * @author Georg Fischer
 */
public class A357534 extends AbstractSequence {

  private int mN = -1;
  private A023359 mSeq1 = new A023359();
  private A209229 mSeq2 = new A209229();

  /** Construct the sequence. */
  public A357534() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (mN == 0) ? Z.ZERO : result;
  }
}
