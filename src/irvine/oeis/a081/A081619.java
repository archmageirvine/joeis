package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081619 Numbers whose divisors can be arranged as equilateral triangle.
 * @author Sean A. Irvine
 */
public class A081619 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.POLYGONAL.is(3, Functions.SIGMA0.l(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
