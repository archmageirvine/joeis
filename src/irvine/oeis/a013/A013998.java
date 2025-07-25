package irvine.oeis.a013;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013998 Unrestricted Perrin pseudoprimes.
 * @author Sean A. Irvine
 */
public class A013998 extends Sequence1 {

  private long mN = 271440;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Predicates.PERRIN.is(n)) {
        return n;
      }
    }
  }
}
