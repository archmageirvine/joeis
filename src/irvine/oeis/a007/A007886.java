package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007886 Number of cycles induced by iterating the Gray-coding of an n-bit number: a(n+1) = a(n) + ( 2^n / C_n), where C_n = least power of 2 &gt;= n (C_n is the length of the cycle).
 * @author Sean A. Irvine
 */
public class A007886 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(Z.ONE.shiftLeft(mN - 1 - IntegerUtils.lg(mN - 1)));
    }
    return mA;
  }
}
