package irvine.oeis.a072;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072909 Least k&gt;0 such that n+k is squarefree.
 * @author Sean A. Irvine
 */
public class A072909 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Predicates.SQUARE_FREE.is(mN + ++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

