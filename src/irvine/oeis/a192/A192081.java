package irvine.oeis.a192;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A192081 Wronskian of sin(kx) and cos(kx), k=1,...,n.
 * @author Georg Fischer
 */
public class A192081 extends Sequence1 {

  private Z mAn1;
  private Z mOddFact;
  private int mN;

  /**
   * Construct the sequence
   */
  public A192081() {
    mAn1 = Z.ONE;
    mOddFact = Z.ONE;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mAn1;
    mOddFact = mOddFact.multiply(2L * mN).multiply(2L * mN + 1);
    mAn1 = mAn1.multiply(mOddFact.square().divide(mN + 1));
    return result;
  }
}
