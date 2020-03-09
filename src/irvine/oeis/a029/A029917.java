package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029917 Convert n from feet to meters.
 * @author Sean A. Irvine
 */
public class A029917 implements Sequence {

  private static final Q FEET_TO_METRES = new Q(3048, 10000);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return FEET_TO_METRES.multiply(mN).add(Q.HALF).floor();
  }
}
