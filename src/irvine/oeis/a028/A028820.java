package irvine.oeis.a028;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028820 Squares with digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A028820 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      if (Predicates.DIGIT_NONDECREASAING.is(n2)) {
        return n2;
      }
    }
  }
}
