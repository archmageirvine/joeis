package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080179 Numbers which on adding their reversal gives perfect cubes.
 * @author Sean A. Irvine
 */
public class A080179 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      if (Predicates.CUBE.is(mN + r)) {
        return Z.valueOf(mN);
      }
    }
  }
}

