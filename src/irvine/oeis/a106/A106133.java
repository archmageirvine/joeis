package irvine.oeis.a106;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A106133 Numbers k such that the k-th semiprime == 8 (mod k).
 * @author Sean A. Irvine
 */
public class A106133 extends Sequence1 {

  private long mN = 0;
  private long mSearch = 1;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SEMIPRIME.is(++mSearch) && mSearch % ++mN == 8 % mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

