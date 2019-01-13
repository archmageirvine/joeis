package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * A001331.
 * @author Sean A. Irvine
 */
public class A001331 extends A001329 {

  @Override
  protected int start() {
    return 0;
  }

  @Override
  protected Z t(final int[] j) {
    Z prod = Z.ONE;
    for (int r = 1; r < j.length; ++r) {
      for (int s = 1; s < j.length; ++s) {
        final int g = IntegerUtils.gcd(r, s);
        final int l = IntegerUtils.lcm(r, s);
        for (int t = 1; t < j.length; ++t) {
          prod = prod.multiply(innerSum(j, IntegerUtils.lcm(l, t)).pow(scale() * j[r] * j[s] * j[t] * IntegerUtils.gcd(g, t)));
        }
      }
    }
    return prod;
  }
}
