package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013932 Integers that are squarefree and also the sum of first k squarefrees for some k.
 * @author Sean A. Irvine
 */
public class A013932 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SQUARE_FREE.is(++mN)) {
        mSum = mSum.add(mN);
        if (Jaguar.factor(mSum).isSquareFree()) {
          return mSum;
        }
      }
    }
  }

}

