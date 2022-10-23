package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003315 Representing n as sum of increasing powers.
 * @author Sean A. Irvine
 */
public class A003315 extends Sequence1 {

  // Recursive descent solution.
  // Theory says 26 is largest possible value for large enough n.
  // No value larger than 6 is known.
  private static final int BIG = 1000;
  private long mN = 0;

  private int solve(final Z n, final int power, final int bestKnown) {
    final Z r = n.root(power);
    if (n.auxiliary() == 1) {
      return 1;
    }
    int best = BIG;
    if (power < bestKnown) {
      for (Z x = r; x.signum() > 0; x = x.subtract(1)) {
        best = Math.min(best, 1 + solve(n.subtract(x.pow(power)), power + 1, best));
      }
    }
    return best;
  }

  @Override
  public Z next() {
    return Z.valueOf(solve(Z.valueOf(++mN), 2, BIG));
  }

}
