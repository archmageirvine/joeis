package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054041 Sum of a(n) terms of 1/k^(1/3) first exceeds n.
 * @author Sean A. Irvine
 */
public class A054041 extends Sequence0 {

  private long mN = -1;
  private CR mSum = CR.ONE;
  private long mK = 1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.valueOf(mN + 1);
    }
    final CR zn = CR.valueOf(mN);
    while (mSum.compareTo(zn) <= 0) {
      mSum = mSum.add(CR.valueOf(++mK).pow(CR.ONE_THIRD).inverse());
    }
    return Z.valueOf(mK);
  }
}
