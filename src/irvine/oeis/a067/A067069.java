package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A067069 Numbers n such that for every k the following condition holds: (*) The number of nonnegative solutions of the Diophantine equation x^2 + n*y^2 = 1+n*k^2 equals one half of the number of divisors of 1+n*k^2 if 1+n*k^2 is not a square and one half of 1 + the number of divisors of 1+n*k^2 if 1+n*k^2 is a square.
 * @author Sean A. Irvine
 */
public class A067069 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 50;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean ok = true;
      for (int k = 1; k <= HEURISTIC; ++k) {
        long r = 0;
        final long q = mN * k * k + 1;
        for (long x = 0; x <= LongUtils.sqrt(q); ++x) {
          for (long y = 0; y <= LongUtils.sqrt((q - x * x) / mN); ++y) {
            if (x * x + mN * y * y == q) {
              ++r;
            }
          }
        }
        final long d = Functions.SIGMA0.l(q);
        final long s = (Predicates.SQUARE.is(q) ? d + 1 : d) / 2;
        if (r != s) {
          ok = false;
          break;
        }
      }

      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
