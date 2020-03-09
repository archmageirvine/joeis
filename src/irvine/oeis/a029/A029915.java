package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029915 Convert n from yards to meters.
 * @author Sean A. Irvine
 */
public class A029915 implements Sequence {

  private static final Q YARDS_TO_METRES = new Q(9144, 10000);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return YARDS_TO_METRES.multiply(mN).round();
  }
}
