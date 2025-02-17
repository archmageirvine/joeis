package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075372 extends Sequence0 {

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
