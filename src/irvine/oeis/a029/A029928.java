package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029928 Convert n from statute miles to nautical miles.
 * @author Sean A. Irvine
 */
public class A029928 implements Sequence {

  private static final Q STATUTE_MILES_TO_NAUTICAL_MILES = new Q(50292, 57875);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return STATUTE_MILES_TO_NAUTICAL_MILES.multiply(mN).round();
  }
}
