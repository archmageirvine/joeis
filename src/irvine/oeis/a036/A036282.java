package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.series.RationalSeriesEnum;
import irvine.math.series.Series;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036282 Write cosec x = 1/x + Sum_{n&gt;=1} e_n * x^(2n-1)/(2n-1)!; sequence gives numerators of e_n.
 * @author Sean A. Irvine
 */
public class A036282 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private final Series<Q> mS = RationalSeriesEnum.XCSC.s();

  @Override
  public Z next() {
    mN += 2;
    if (mN > 2) {
      mF = mF.multiply((mN - 1) * (long) (mN - 2));
    }
    return mS.coeff(mN).multiply(mF).num();
  }
}

