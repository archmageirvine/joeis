package irvine.oeis.a385;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385723 Numbers k such that m^m == m (mod k) where m = ceiling(k/2).
 * @author Sean A. Irvine
 */
public class A385723 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long m = (++mN + 1) / 2;
      if (LongUtils.modPow(m, m, mN) == m % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
