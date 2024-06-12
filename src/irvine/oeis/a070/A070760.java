package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070760 extends Sequence1 {

  private long mN = 99;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.REVERSE.z(++mN).multiply(mN);
      if (Predicates.SQUARE.is(t) && !t.equals(Z.valueOf(mN).square())) {
        return Z.valueOf(mN);
      }
    }
  }
}
