package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079040 Fractional part of 1/(1-tanh(n)) decreases monotonically to zero.
 * @author Sean A. Irvine
 */
public class A079040 extends Sequence1 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR z = CR.ONE.subtract(ComputableReals.SINGLETON.tanh(CR.valueOf(++mN))).inverse().frac();
      if (z.compareTo(mBest) < 0) {
        mBest = z;
        return Z.valueOf(mN);
      }
    }
  }
}
