package irvine.oeis.a361;
// manually anopsn 0,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003087;

/**
 * A361589 Number of acyclic digraphs on n unlabeled nodes without isolated nodes.
 * @author Georg Fischer
 */
public class A361589 extends AbstractSequence {

  private int mN = -1;
  private A003087 mSeq1 = new A003087();
  private Z mA;

  /** Construct the sequence. */
  public A361589() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
