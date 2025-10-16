package irvine.oeis.a389;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388063.
 * @author Sean A. Irvine
 */
public class A389664 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (Predicates.SQUARE.is(++mN)) {
      return Z.ONE;
    }
    long m = 1;
    while (true) {
      if (Predicates.SQUARE.is(Z.valueOf(++m).square().subtract(1).multiply(mN).add(1))) {
        return Z.valueOf(m);
      }
    }
  }
}

