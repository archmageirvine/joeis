package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081125 a(n) = n!/floor(n/2)!.
 * @author Georg Fischer
 */
public class A081125 implements Sequence {

  protected int mN;
  protected Z mFact;
  protected Z mFact2;

  /** Construct the sequence. */
  public A081125() {
    mN = -1;
    mFact = Z.ONE;
    mFact2 = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN >= 2) {
      mFact = mFact.multiply(mN);
    }
    if (mN >= 4 && (mN & 1) == 0) {
      mFact2 = mFact2.multiply(mN / 2);
    }
    return mFact.divide(mFact2);
  }
}
