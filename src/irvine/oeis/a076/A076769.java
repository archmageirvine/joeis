package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076769 Integers not expressible as the sum of a positive triangular number and a square.
 * @author Sean A. Irvine
 */
public class A076769 extends Sequence1 {

  private long mN = 7;

  private boolean is(final long n) {
    long k = 0;
    while (true) {
      final long t = Functions.TRIANGULAR.l(++k);
      if (t > n) {
        return true;
      }
      if (Predicates.SQUARE.is(n - t)) {
        return false;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
