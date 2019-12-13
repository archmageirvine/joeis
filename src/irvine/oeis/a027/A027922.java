package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027922 Least k such that <code>1+2+...+k &gt;= 1^2 + 2^2 + ... + n^2</code>.
 * @author Sean A. Irvine
 */
public class A027922 implements Sequence {

  private Z mSumSquares = Z.ZERO;
  private long mN = 0;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    mSumSquares = mSumSquares.add(++mN * mN);
    while (mK.multiply(mK.add(1)).divide2().compareTo(mSumSquares) < 0) {
      mK = mK.add(1);
    }
    return mK;
  }
}
