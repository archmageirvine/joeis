package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083909 Numbers of the form 10^(m-k)*(10^(m+k+1)-10^k), m, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A083909 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(9);
    mB = mB == null ? Z.ONE : mB.multiply(10);
    return mA.multiply(mB);
  }
}
