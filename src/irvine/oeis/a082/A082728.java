package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082728 Numbers expressible as a sum of 2 nonzero Fibonacci numbers in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A082728 extends Sequence1 {

  private long mN = 4;

  private boolean is(final long n) {
    int cnt = 0;
    int k = 0;
    while (true) {
      final long f = Functions.FIBONACCI.l(++k);
      if (2 * f > n) {
        break;
      }
      if (Predicates.FIBONACCI.is(n - f) && ++cnt > 1) {
        return false;
      }
    }
    return cnt == 1;
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
