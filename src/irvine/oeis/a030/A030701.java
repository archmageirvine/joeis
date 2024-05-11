package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030701 Decimal expansion of 4^n contains no zeros (probably finite).
 * @author Sean A. Irvine
 */
public class A030701 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.shiftLeft(2);
      }
      if (!Predicates.DIGIT_CONTAINS_ZERO.is(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


