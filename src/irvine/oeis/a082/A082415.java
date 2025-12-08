package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A082415 Numbers n such that in all partitions of n into distinct coprimes these coprimes are also mutually relatively prime.
 * @author Sean A. Irvine
 */
public class A082415 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private boolean isMututallyCoprime(final boolean mutuallyCoprime, final int[] p, final int pos, final int part) {
    if (!mutuallyCoprime) {
      return false;
    }
    for (int k = 0; k < pos; ++k) {
      if (Functions.GCD.i(p[k], part) > 1) {
        return false;
      }
    }
    return true;
  }

  private boolean is(final int n, final int sum, final int prev, final int[] p, final int pos, final boolean mutallyCoprime) {
    if (sum == n) {
      return mutallyCoprime;
    }
    for (int part = prev + 1; sum + part <= n; ++part) {
      if (Functions.GCD.i(n, part) == 1) {
        p[pos] = part;
        if (!is(n, sum + part, part, p, pos + 1, isMututallyCoprime(mutallyCoprime, p, pos, part))) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean is(final int n) {
    return is(n, 0, 0, new int[n], 0, true);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 10000 == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
    }
  }
}
