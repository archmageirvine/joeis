package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005054 a(0) = 1; a(n) = 4*5^(n-1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A005054 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mA.equals(Z.ONE) ? 4 : 5);
    return mA;
  }
}

