package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072284 Numbers k begins a new chain of squarefree integers. I.e., k is squarefree but k-1 is not.
 * @author Sean A. Irvine
 */
public class A072284 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (!Predicates.SQUARE_FREE.is(++mN) && Predicates.SQUARE_FREE.is(mN + 1)) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
