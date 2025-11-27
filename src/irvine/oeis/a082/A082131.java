package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082131 Middle of semiprime triple: n-2, n, n+2 are semiprimes.
 * @author Sean A. Irvine
 */
public class A082131 extends Sequence1 {

  private long mN = 91;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Predicates.SEMIPRIME.is(mN) && Predicates.SEMIPRIME.is(mN - 2) && Predicates.SEMIPRIME.is(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
