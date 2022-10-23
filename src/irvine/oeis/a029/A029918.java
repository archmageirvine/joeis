package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029918 Convert n from meters to feet.
 * @author Sean A. Irvine
 */
public class A029918 extends Sequence0 {

  private static final Q METRES_TO_FEET = new Q(10000, 3048);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return METRES_TO_FEET.multiply(mN).round();
  }
}
