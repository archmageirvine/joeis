package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037962 a(n) = n*(15*n^3 + 30*n^2 + 5*n - 2)*(n+4)!/5760.
 * @author Sean A. Irvine
 */
public class A037962 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 4);
    return mF.multiply(mN)
      .multiply(Z.valueOf(mN).multiply(15).add(30).multiply(mN).add(5).multiply(mN).subtract(2))
      .divide(5760);
  }
}

