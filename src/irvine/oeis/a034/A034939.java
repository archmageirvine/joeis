package irvine.oeis.a034;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034939 a(n) is smallest number such that a(n)^2 + 1 is divisible by 5^n. 
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A034939 extends Sequence0 {

  protected Z mParm1;
  protected Z mParm2;

  /** Construct the sequence. */
  public A034939() {
    this(5, 2);
  }

  /**
   * Generic constructor with parameter
   * @param parm1 divisor base
   * @param parm2 a(1)
   */
  public A034939(final int parm1, final int parm2) {
    mParm1 = Z.valueOf(parm1);
    mParm2 = Z.valueOf(parm2);
  }

  private Z mT = null;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
      return Z.ZERO;
    } else {
      mT = mT.multiply(mParm1);
      mPrev = mPrev == null ? mParm2 : mPrev.modPow(mParm1, mT);
    }
    return mPrev.min(mT.subtract(mPrev));
  }
}
