package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081975 Triangular number pertaining to A081974. a(n) = A081974(n)*A081974(n+1).
 * @author Sean A. Irvine
 */
public class A081975 extends Sequence1 {

  private final LongDynamicBooleanArray mSeenN = new LongDynamicBooleanArray();
  private final HashSet<Z> mSeenTriangular = new HashSet<>();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    long k = 1;
    while (true) {
      if (!mSeenN.isSet(++k)) {
        final Z t = mA.multiply(k);
        if (Predicates.TRIANGULAR.is(t) && mSeenTriangular.add(t)) {
          mSeenN.set(k);
          mA = Z.valueOf(k);
          return t;
        }
      }
    }
  }
}
