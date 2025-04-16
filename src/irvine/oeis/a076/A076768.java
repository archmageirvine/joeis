package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076768 Positive integers not expressible as the sum of a prime and a triangular number.
 * @author Sean A. Irvine
 */
public class A076768 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long k = -1;
    while (true) {
      final long t = Functions.TRIANGULAR.l(++k);
      if (t >= n) {
        return true;
      }
      if (Predicates.PRIME.is(n - t)) {
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
