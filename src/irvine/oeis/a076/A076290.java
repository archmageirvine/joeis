package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076253.
 * @author Sean A. Irvine
 */
public class A076290 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (Predicates.SEMIPRIME.is(d)) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
