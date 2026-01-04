package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082980 Rearrangement of triangular numbers such that the sum of two consecutive terms is a palindrome.
 * @author Sean A. Irvine
 */
public class A082980 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    long m = 0;
    while (true) {
      if (!mUsed.isSet(++m)) {
        final Z t = Functions.TRIANGULAR.z(m);
        if (Predicates.PALINDROME.is(mA.add(t))) {
          mUsed.set(m);
          mA = t;
          return mA;
        }
      }
    }
  }
}
