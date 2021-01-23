package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036384 Number of odd split numbers (A036382) in the interval [2^(n-1), 2^n].
 * @author Sean A. Irvine
 */
public class A036384 extends A036382 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    long c = 0;
    while (mA.compareTo(mLim) <= 0) {
      mA = super.next();
      ++c;
    }
    return Z.valueOf(c);
  }
}
