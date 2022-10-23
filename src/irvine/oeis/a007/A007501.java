package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007501 a(0) = 2; for n &gt;= 0, a(n+1) = a(n)*(a(n)+1)/2.
 * @author Sean A. Irvine
 */
public class A007501 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(mA.add(1)).divide2();
    return mA;
  }
}

