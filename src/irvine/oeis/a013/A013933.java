package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013933 Numbers k such that the sum of the first k nonsquarefree numbers is nonsquarefree.
 * @author Sean A. Irvine
 */
public class A013933 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (!Predicates.SQUARE_FREE.is(n)) {
        ++mM;
        mSum = mSum.add(mN);
        if (!Jaguar.factor(mSum).isSquareFree()) {
          return Z.valueOf(mM);
        }
      }
    }
  }

}

