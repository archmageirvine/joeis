package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013935 a(n) is nonsquarefree and is sum of first k nonsquarefrees for some k.
 * @author Sean A. Irvine
 */
public class A013935 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (!Predicates.SQUARE_FREE.is(n)) {
        mSum = mSum.add(mN);
        if (!Jaguar.factor(mSum).isSquareFree()) {
          return mSum;
        }
      }
    }
  }

}

