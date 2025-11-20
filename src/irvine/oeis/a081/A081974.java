package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081974 a(1) = 1 and smallest number not occurring earlier such that the product of two neighboring terms is a distinct triangular number, where "distinct" means that a(n)*a(n+1) may not equal the product of any two previous consecutive terms.
 * @author Sean A. Irvine
 */
public class A081974 extends Sequence1 {

  private final LongDynamicBooleanArray mSeenN = new LongDynamicBooleanArray();
  private final HashSet<Z> mSeenTriangular = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (!mSeenN.isSet(++k)) {
        final Z t = mA.multiply(k);
        if (Predicates.TRIANGULAR.is(t) && mSeenTriangular.add(t)) {
          mSeenN.set(k);
          mA = Z.valueOf(k);
          return mA;
        }
      }
    }
  }
}
