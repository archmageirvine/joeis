package irvine.oeis.a306;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a102.A102477;

/**
 * A306604 Number of perfect squares in the half-open interval [Pi^(n-1), Pi^n).
 * @author Georg Fischer
 */
public class A306604 extends AbstractSequence {

  private A102477 mSeq1 = new A102477();
  private Z mA;

  /** Construct the sequence. */
  public A306604() {
    super(0);
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
