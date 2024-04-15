package irvine.oeis.a051;
// manually 2021-09-29

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051812 Number of n-digit numbers with nonzero multiplicative digital root 1.
 * Caution, works for n &lt; 10^18 only!
 * @author Georg Fischer
 */
public class A051812 extends Sequence1 {

  protected long mN; // current index
  protected long mPow10; // 10^n
  protected int mParm; // desired root
  protected boolean mReset; // whether to reset the count at 10^n
  protected Z mCount; // result

  /** Construct the sequence. */
  public A051812() {
    this(1, true);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter
   * @param reset whether to reset the count at 10^n.
   */
  public A051812(final int parm, final boolean reset) {
    mN = 0;
    mParm = parm;
    mReset = reset;
    mCount = Z.ZERO;
    mPow10 = 10;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = mCount;
      final int count1 = Functions.DIGIT_NZ_PRODUCT_ROOT.l(mN) == mParm ? 1 : 0;
      if (mN == mPow10) {
        if (mReset) {
          mCount = Z.ZERO;
        }
        mPow10 *= 10;
        if (mPow10 >= 1000000000000000000L) {
          throw new UnsupportedOperationException("implementation limit 10^18 reached");
        } else { 
          mCount = mCount.add(count1);
          return result;
        }
      } else {
        mCount = mCount.add(count1);
      }
    }
  }
}
