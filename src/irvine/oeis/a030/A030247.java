package irvine.oeis.a030;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001329;

/**
 * A030247 Number of nonisomorphic idempotent groupoids.
 * @author Sean A. Irvine
 */
public class A030247 extends A001329 {

  @Override
  protected Z fix(final int[] j) {
    Z prod = Z.ONE;
    for (int r = 1; r < j.length; ++r) {
      for (int s = 1; s < j.length; ++s) {
        prod = prod.multiply(innerSum(j, IntegerUtils.lcm(r, s)).pow((long) scale() * j[r] * j[s] * Functions.GCD.i(r, s) - (r == s ? j[r] : 0)));
      }
    }
    return prod;
  }
}
