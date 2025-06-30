package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075372 Smallest squarefree number not occurring earlier such that the every partial sum is squarefree.
 * @author Sean A. Irvine
 */
public class A075372 extends Sequence1 {

  private final Set<Long> mSeen = new HashSet<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      if (Predicates.SQUARE_FREE.is(++k)) {
        final Z t = mSum.add(k);
        if (Predicates.SQUARE_FREE.is(t) && mSeen.add(k)) {
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
