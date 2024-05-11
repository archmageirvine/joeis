package irvine.oeis.a052;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052044 Numbers k such that k^3 lacks the digit zero in its decimal expansion.
 * @author Sean A. Irvine
 */
public class A052044 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(mN.pow(3))) {
        return mN;
      }
    }
  }
}

