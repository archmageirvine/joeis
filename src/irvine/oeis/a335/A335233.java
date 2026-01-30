package irvine.oeis.a335;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A335233 Numbers m such that m!*i + 1 is composite for i = 1..m.
 * @author Sean A. Irvine
 */
public class A335233 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final Z f = Functions.FACTORIAL.z(n);
    for (long k = 1; k <= n; ++k) {
      if (f.multiply(k).add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
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
