package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077199 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (Predicates.SQUARE_FREE.is(++k) && Predicates.SQUARE_FREE.is(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

