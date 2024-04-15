package irvine.oeis.a302;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A302563 Numbers whose digital root is equal to their number of digits.
 * @author Georg Fischer
 */
public class A302563 extends Sequence1 {

  protected long mN; // current index
  protected long mPow10; // 10^k
  protected int mLen; // number of digits k

  /** Construct the sequence. */
  public A302563() {
    mN = -1;
    mPow10 = 10;
    mLen = 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN == mPow10) {
        mPow10 *= 10;
        ++mLen;
      }
      if (Functions.DIGIT_SUM_ROOT.l(mN) == mLen) {
        return Z.valueOf(mN);
      }
    }
  }
}
