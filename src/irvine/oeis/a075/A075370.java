package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075370 Smallest squarefree number &gt; 1 such that the every partial sum is squarefree.
 * @author Sean A. Irvine
 */
public class A075370 extends Sequence0 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    long k = 1;
    while (true) {
      if (Predicates.SQUARE_FREE.is(++k)) {
        final Z t = mSum.add(k);
        if (Predicates.SQUARE_FREE.is(t)) {
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
