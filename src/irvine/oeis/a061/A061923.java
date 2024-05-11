package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061923 Difference between n and its reversal is a nonzero cube.
 * @author Sean A. Irvine
 */
public class A061923 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.subtract(Functions.REVERSE.z(mN));
      if (!t.isZero() && Predicates.CUBE.is(t)) {
        return mN;
      }
    }
  }
}

