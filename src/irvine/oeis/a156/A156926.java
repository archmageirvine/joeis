package irvine.oeis.a156;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A156926 Row sums of the FP2 polynomials of A156925.
 * Recurrence: a(n) = -2*n!*a(n-1)*(-1)^n.
 * @author Georg Fischer
 */
public class A156926 implements Sequence {

  private Z mFact;
  private Z mAn;
  private int mN;

  /** Construct the sequence */
  public A156926() {
    mFact = Z.ONE;
    mAn = Z.ONE;
    mN = 0;
  }

  @Override
  public Z next() {
    final Z result = mAn;
    ++mN;
    mFact = mFact.multiply(mN);
    mAn = mAn.multiply(mFact).multiply2();
    if ((mN & 1) == 0) { // n even
      mAn = mAn.negate();
    }
    return result;
  }
}
