package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A242426 floor(n! / n^3).
 * @author Georg Fischer
 */
public class A242426 implements Sequence {

  private int mN = 0;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    return mFact.divide(Z.valueOf(mN).multiply(mN).multiply(mN));
  }
}
