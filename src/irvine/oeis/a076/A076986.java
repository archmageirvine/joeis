package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076986 Smallest squarefree number of the form n*k + 1.
 * @author Sean A. Irvine
 */
public class A076986 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      k += mN;
      if (Predicates.SQUARE_FREE.is(k)) {
        return Z.valueOf(k);
      }
    }
  }
}

