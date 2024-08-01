package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071577 Smallest k such that 2ik+1 is squarefree for 1&lt;=i&lt;=n.
 * @author Sean A. Irvine
 */
public class A071577 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private boolean is(final long m, final long n) {
    final Z t = Z.valueOf(2 * m);
    for (long k = 1; k <= n; ++k) {
      if (!Predicates.SQUARE_FREE.is(t.multiply(k).add(1))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

