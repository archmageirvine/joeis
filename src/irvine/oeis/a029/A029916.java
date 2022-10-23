package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029916 Convert n from meters to yards.
 * @author Sean A. Irvine
 */
public class A029916 extends Sequence0 {

  private static final Q METRES_TO_YARDS = new Q(10000, 9144);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return METRES_TO_YARDS.multiply(mN).round();
  }
}
