package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066979 a(n) = floor(n!/2^n).
 * @author Georg Fischer
 */
public class A066979 extends Sequence1 {

  private int mN = 0;
  private Z mFact = Z.ONE;
  private Z mPow2 = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    mPow2 = mPow2.multiply2();
    return mFact.divide(mPow2);
  }
}
