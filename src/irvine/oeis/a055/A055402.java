package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055402 Least number represented as the sum of n cubes with greedy algorithm.
 * @author Sean A. Irvine
 */
public class A055402 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    mA = mA.add(CR.valueOf(new Q(mA, Z.THREE).add(Q.ONE_QUARTER)).sqrt().subtract(CR.HALF).ceil().pow(3));
    return mA;
  }
}
