package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011934 a(n) = |1^3 - 2^3 + 3^3 - 4^3 + ... + (-1)^(n+1)*n^3|.
 * @author Sean A. Irvine
 */
public class A011934 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mA = Z.valueOf(++mN).pow(3).subtract(mA);
    return mA;
  }
}
