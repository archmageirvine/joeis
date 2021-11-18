package irvine.oeis.a212;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A212310 a(n) = n! mod 4^n.
 * @author Georg Fischer
 */
public class A212310 implements Sequence {

  private int mN = -1;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 0) {
      mFact = mFact.multiply(mN);
    }
    return mFact.mod(Z.FOUR.pow(mN));
  }
}
