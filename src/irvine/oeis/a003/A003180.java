package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000595;

/**
 * A003180 Number of equivalence classes of Boolean functions of n variables under action of symmetric group.
 * @author Sean A. Irvine
 */
public class A003180 extends A000595 {

  @Override
  protected Z zeroCase() {
    return Z.TWO;
  }

  private int innerSum(final int[] j, final int d) {
    int s = 0;
    for (int k = 1; k < j.length; ++k) {
      s += Functions.GCD.i(k, d) * j[k];
    }
    return s;
  }

  private int lcm(final int n) {
    int lcm = 1;
    for (int k = 1; k <= n; ++k) {
      lcm = Functions.LCM.i(lcm, k);
    }
    return lcm;
  }

  @Override
  protected int t(final int[] j) {
    int sum = 0;
    final int ord = lcm(mN);
    for (int i = 1; i <= ord; ++i) {
      if (ord % i == 0) {
        final int shift = innerSum(j, i);
        if (shift > 32) {
          throw new UnsupportedOperationException();
        }
        sum += (int) Functions.PHI.l((long) (ord / i)) * (1 << shift);
      }
    }
    return sum / ord;
  }
}
