package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A382852 A greedy expansion of Pi where each numerator a(n) is the denominator of the previous term added, and each a(n) is as small as possible without the sum of terms being greater than Pi. The first numerator is 3.
 * @author Sean A. Irvine
 */
public class A382852 extends Sequence0 {

  private Z mA = null;
  private Q mG = Q.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final Z t = mA;
      mA = CR.valueOf(mA).divide(CR.PI.subtract(CR.valueOf(mG))).ceil();
      mG = mG.add(new Q(t, mA));
    }
    return mA;
  }
}

