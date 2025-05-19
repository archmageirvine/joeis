package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077381 Number of squarefree numbers between successive squares (exclusive).
 * @author Sean A. Irvine
 */
public class A077381 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = mN * mN + 1; k < (mN + 1) * (mN + 1); ++k) {
      if (Predicates.SQUARE_FREE.is(k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
