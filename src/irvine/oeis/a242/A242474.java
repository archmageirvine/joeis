package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A242474 Numbers n such that A = n - digitsum(n) is divisible by the largest power of 10 &lt;= A.
 * @author Georg Fischer
 */
public class A242474 extends Sequence1 {

  private static final Z TWENTY = Z.valueOf(20);
  private Z mK = Z.ZERO;
  private Z mPow10 = Z.TEN;
  private Z mLimit = TWENTY;

  @Override
  public Z next() {
    mK = mK.add(1);
    if (mK.compareTo(TWENTY) < 0) {
      return mK;
    }
    if (mK.equals(mLimit)) {
      mPow10 = mPow10.multiply(10);
      mK = mPow10.multiply(9);
      mLimit = mK.add(20);
      mK = mK.add(10);
      return mK;
    }
    return mK;
  }
}
