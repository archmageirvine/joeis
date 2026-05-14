package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084839 Smallest integers that satisfy sum(n&gt;0, mu(a(n))*log(a(n))/a(n))=-1 by requiring that the absolute values of 1 + the successive partial sums are monotonically decreasing in magnitude, where a(1)=1 and a(n+1)&gt;a(n) for n&gt;0.
 * @author Sean A. Irvine
 */
public class A084839 extends Sequence1 {

  private static final int PRECISION = -500;
  private Z mA = Z.ZERO;
  private CR mS = CR.ZERO;
  private CR mW = CR.TWO;

  @Override
  public Z next() {
    mA = mA.add(1);
    if (mA.compareTo(Z.THREE) > 0) {
      while (mS.add(CR.valueOf(mA).log().multiply(Functions.MOBIUS.l(mA)).divide(mA).add(1)).abs().compareTo(mW, PRECISION) >= 0) {
        mA = mA.add(1);
      }
    }
    mS = mS.add(CR.valueOf(mA).log().multiply(Functions.MOBIUS.l(mA)).divide(mA));
    mW = mS.add(1).abs();
    return mA;
  }
}
