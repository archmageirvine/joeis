package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066979 a(n) = floor(n!/2^n).
 * @author Georg Fischer
 */
public class A066979 implements Sequence {

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
