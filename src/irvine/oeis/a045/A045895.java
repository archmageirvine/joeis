package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045895 Period length of pairs (a,b) where a has period 2n-2 and b has period n.
 * @author Sean A. Irvine
 */
public class A045895 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return mN.lcm(t.multiply2());
  }
}
