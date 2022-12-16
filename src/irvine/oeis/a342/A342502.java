package irvine.oeis.a342;
// manually anopsn 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a078.A078946;

/**
 * A342502 Gaps between first elements of prime quintuples of the form (p, p+2, p+6, p+12, p+14). The quintuples are abutting: twin/cousin/sexy/twin pairs.
 * @author Georg Fischer
 */
public class A342502 extends AbstractSequence {

  private A078946 mSeq1 = new A078946();
  private Z mA;

  /** Construct the sequence. */
  public A342502() {
    super(1);
    mA = Z.FIVE;
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
