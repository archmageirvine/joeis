package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038567 Denominators in canonical bijection from positive integers to positive rationals &lt;= 1.
 * Offset 0. Starting 1/1, 1/2, 1/3, 2/3, 1/4, 3/4, 1/5, 2/5, 3/5.
 * @author Georg Fischer
 */
public class A038567 implements Sequence {

  protected long mNum = 0;
  protected long mDen = 1;
  protected int mState;

  /**
   * Construct the sequence
   */
  public A038567() {
    mNum = 0;
    mDen = 1;
    mState = 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mNum > mDen) {
        ++mDen;
        mNum = 1;
      }
      if (LongUtils.gcd(mNum, mDen) == 1) {
        return Z.valueOf(mDen);
      }
    }
  }
}
