package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050255 A Diaconis-Mosteller approximation to the Birthday problem function.
 * @author Sean A. Irvine
 */
public class A050255 implements Sequence {

  // Diaconis-Mosteller approximation to the birthday problem

  private static final CR LN2 = CR.TWO.log();
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mA = 0;
  private int mN = 0;

  private CR right(final int n, final int k) {
    final Q a = Q.ONE.subtract(new Q(n, 365L * (k + 1L))).multiply(mF.factorial(k).multiply(Z.valueOf(365).pow(k - 1)));
    return ComputableReals.SINGLETON.pow(CR.valueOf(a).multiply(LN2), CR.valueOf(new Q(1, k)));
  }

  private CR left(final int n, final int k) {
    return CR.valueOf(new Q(-n, 365L * k)).exp().multiply(n);
  }

  private double error(final int n, final int k) {
    return left(n, k).subtract(right(n, k)).abs().doubleValue();
  }

  @Override
  public Z next() {
    ++mN;
    double error = Double.POSITIVE_INFINITY;
    int best = mA;
    double delta;
    while ((delta = error(++mA, mN)) <= error) {
      error = delta;
      best = mA;
    }
    // At this point "best" contains the best integer solution, but the actually best
    // real value can be larger, and the algorithm calls for the ceiling of the actual
    // best value.  The following check seems sufficient to get the right value.
    if (error(best - 1, mN) > error(best + 1, mN)) {
      ++best;
    }
    mA = best;
    return Z.valueOf(best);
  }

}

