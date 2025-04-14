package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007770 Happy numbers: numbers whose trajectory under iteration of sum of squares of digits map (see A003132) includes 1.
 * @author Sean A. Irvine
 */
public class A007770 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.HAPPY.is(mN)) {
        return mN;
      }
    }
  }
}
