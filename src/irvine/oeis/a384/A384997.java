package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384997 Numbers m such that phi(m) is a heptagonal number.
 * @author Sean A. Irvine
 */
public class A384997 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.POLYGONAL.is(7, Functions.PHI.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
