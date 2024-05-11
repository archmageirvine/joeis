package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030705 Numbers k such that the decimal expansion of 9^k contains no zeros (probably finite).
 * @author Sean A. Irvine
 */
public class A030705 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(9);
      }
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


