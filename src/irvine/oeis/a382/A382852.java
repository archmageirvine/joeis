package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382852 allocated for Nathan James Blackerby.
 * @author Sean A. Irvine
 */
public class A382852 extends Sequence1 {

  private Z mA = Z.THREE;
  private Q mG = Q.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = CR.valueOf(mA).divide(CR.PI.subtract(CR.valueOf(mG))).ceil();
    mG = mG.add(new Q(t, mA));
    return mA;
  }
}

