package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A073879 a(1) = 1, a(n) = smallest number not included earlier such that a(1)+...+a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A073879 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mSum.add(k);
        if (Predicates.PALINDROME.is(t)) {
          mUsed.set(k);
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
