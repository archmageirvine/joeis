package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070544 Number of squarefree numbers s such that n &lt; s &lt; 2n.
 * @author Sean A. Irvine
 */
public class A070544 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = mN + 1; k < 2 * mN; ++k) {
      if (Predicates.SQUARE_FREE.is(k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
