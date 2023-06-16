package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007013 Catalan-Mersenne numbers: a(0) = 2; for n &gt;= 0, a(n+1) = 2^a(n) - 1.
 * @author Sean A. Irvine
 */
public class A007013 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : Z.ONE.shiftLeft(mA.longValueExact()).subtract(1);
    return mA;
  }
}

