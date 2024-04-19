package irvine.oeis.a085;
// manually anopan 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005315;
import irvine.oeis.a077.A077054;

/**
 * A085973 Number of ways a loop can cross two parallel roads 2n times.
 * @author Georg Fischer
 */
public class A085973 extends AbstractSequence {

  private int mN = -1;
  private final A077054 mSeq1 = new A077054();
  private final A005315 mSeq2 = new A005315();

  /** Construct the sequence. */
  public A085973() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 0) ? Z.THREE : result;
  }
}
