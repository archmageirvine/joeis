package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029927 Convert n from nautical miles to statute miles.
 * @author Sean A. Irvine
 */
public class A029927 extends Sequence0 {

  private static final Q NAUTICAL_MILES_TO_STATUTE_MILES = new Q(57875, 50292);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return NAUTICAL_MILES_TO_STATUTE_MILES.multiply(mN).round();
  }
}
