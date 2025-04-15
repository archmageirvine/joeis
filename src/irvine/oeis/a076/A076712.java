package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076712 Triangular numbers which are also happy numbers (cf. A007770).
 * @author Sean A. Irvine
 */
public class A076712 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.TRIANGULAR.z(++mN);
      if (Predicates.HAPPY.is(t)) {
        return t;
      }
    }
  }
}
