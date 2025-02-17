package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075382 extends Sequence1 {

  private long mN = 0;
  private long mM = 4;
  
  private boolean is(long m) {
    for (long k = 0; k < mN; ++k, m += 2) {
      if (Predicates.SQUARE_FREE.is(m)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM)) {
      mM += 2;
    }
    return Z.valueOf(mM);
  }
}
