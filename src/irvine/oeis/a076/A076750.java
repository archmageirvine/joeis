package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076750 Squares which are the product of a non-palindrome and its reversal, where leading zeros are not allowed.
 * @author Sean A. Irvine
 */
public class A076750 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply(10).compareTo(mA.last()) > 0) {
      if (++mN % 10 != 0) {
        final long r = Functions.REVERSE.l(mN);
        if (r > mN) {
          final Z t = Z.valueOf(mN).multiply(r);
          if (Predicates.SQUARE.is(t)) {
            mA.add(t);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
