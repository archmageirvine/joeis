package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075371 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE_FREE.is(++mN)) {
        final Z t = mSum.add(mN);
        if (Predicates.SQUARE_FREE.is(t)) {
          mSum = t;
          return Z.valueOf(mN);
        }
      }
    }
  }
}
