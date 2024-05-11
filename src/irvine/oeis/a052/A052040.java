package irvine.oeis.a052;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052040 Numbers whose square is zeroless.
 * @author Sean A. Irvine
 */
public class A052040 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(mN.square())) {
        return mN;
      }
    }
  }
}

