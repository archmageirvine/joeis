package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081123 a(n) = floor(n/2)!.
 * @author Georg Fischer
 */
public class A081123 implements Sequence {

  protected int mN;
  protected Z mFact2;

  /** Construct the sequence. */
  public A081123() {
    mN = -1;
    mFact2 = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN >= 4 && (mN & 1) == 0) {
      mFact2 = mFact2.multiply(mN / 2);
    }
    return mFact2;
  }
}
