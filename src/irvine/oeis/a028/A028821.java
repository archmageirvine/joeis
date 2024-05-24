package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028821 Numbers k such that k^2 has digits in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A028821 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.DIGIT_NONINCREASING.is(mN.square())) {
        return mN;
      }
    }
  }
}
