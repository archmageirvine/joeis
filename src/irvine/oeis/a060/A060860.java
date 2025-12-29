package irvine.oeis.a060;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060860 Numbers k such that k^2-1 and k^2 are consecutive powerful numbers.
 * @author Sean A. Irvine
 */
public class A060860 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Predicates.SQUAREFUL.is(n.square().subtract(1))) {
        return n;
      }
    }
  }
}
