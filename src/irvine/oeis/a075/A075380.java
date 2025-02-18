package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075380 Rearrangement of natural numbers so that the sum of two neighboring terms is not squarefree.
 * @author Sean A. Irvine
 */
public class A075380 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mA.add(k);
        if (!Predicates.SQUARE_FREE.is(t)) {
          mUsed.set(k);
          mA = Z.valueOf(k);
          return mA;
        }
      }
    }
  }
}
