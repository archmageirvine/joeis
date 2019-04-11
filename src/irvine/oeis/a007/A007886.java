package irvine.oeis.a007;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007886 Number of cycles induced by iterating the Gray-coding of an n-bit number: <code>a(n+1) = a(n) + ( 2^n /</code> C_n), where C_n = least power of <code>2 &gt;= n</code> (C_n is the length of the cycle).
 * @author Sean A. Irvine
 */
public class A007886 implements Sequence {

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
