package irvine.oeis.a389;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389884 Numbers k such that k^2 + 1 is a Sophie Germain prime.
 * @author Sean A. Irvine
 */
public class A389884 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SOPHIE_GERMAIN.is(Z.valueOf(++mN).square().add(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
