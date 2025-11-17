package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A081863 Largest integer m such that m divides (sigma_(2n+1)(2k-1)-sigma(2k-1)) for all k&gt;=1.
 * @author Sean A. Irvine
 */
public class A081863 extends Sequence1 implements Conjectural {

  // After Michel Marcus

  private static final int HEURISTIC = 100;
  private long mN = 0;

  private Z ds(final long n, final long k) {
    return Functions.SIGMA.z(2 * n + 1, 2 * k - 1).subtract(Functions.SIGMA1.z(2 * k - 1));
  }

  @Override
  public Z next() {
    Z m = ds(++mN, 1);
    for (long k = 2; k <= HEURISTIC; ++k) {
      m = Functions.GCD.z(m, ds(mN, k));
    }
    return m;
  }
}
