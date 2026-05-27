package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085050 Smallest multiple of n sandwiched between two squarefree numbers.
 * @author Sean A. Irvine
 */
public class A085050 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      k += mN;
      if (Predicates.SQUARE_FREE.is(k - 1) && Predicates.SQUARE_FREE.is(k + 1)) {
        return Z.valueOf(k);
      }
    }
  }
}
