package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007013 Catalan-Mersenne numbers: <code>a(0) = 2;</code> for <code>n &gt;= 0, a(n+1) = 2^a(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A007013 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : Z.ONE.shiftLeft(mA.intValueExact()).subtract(1);
    return mA;
  }
}

