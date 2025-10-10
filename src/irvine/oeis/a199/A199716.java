package irvine.oeis.a199;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A199716 Numbers k such that 6k-5 and 6k-1 are both composite.
 * @author Sean A. Irvine
 */
public class A199716 extends Sequence1 {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!Predicates.PRIME.is(6 * mN - 5) && !Predicates.PRIME.is(6 * mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
