package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053816 Another version of the Kaprekar numbers (A006886): n such that n=q+r and n^2=q*10^m+r, for some m &gt;= 1, q&gt;=0 and 0&lt;=r&lt;10^m, with n != 10^a, a&gt;=1 and n an m-digit number.
 * @author Sean A. Irvine
 */
public class A053816 implements Sequence {

  private long mN = 0;
  private long mLimit = 10;
  private Z mLimitZ = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLimit) {
        mLimit *= 10;
        mLimitZ = mLimitZ.multiply(10);
      }
      final Z s = Z.valueOf(mN).square();
      final Z [] qr = s.divideAndRemainder(mLimitZ);
      if (qr[0].add(qr[1]).longValueExact() == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

