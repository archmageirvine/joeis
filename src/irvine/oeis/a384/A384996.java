package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384996 Numbers m such that phi(m) is a hexagonal number.
 * @author Sean A. Irvine
 */
public class A384996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.POLYGONAL.is(6, Functions.PHI.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
