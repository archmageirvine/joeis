package irvine.oeis.a030;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a001.A001329;

/**
 * A030257.
 * @author Sean A. Irvine
 */
public class A030257 extends A001329 {

  @Override
  protected Z t(final int[] s) {
    Z prod = Z.ONE;
    for (int i = 1; i < s.length; ++i) {
      for (int j = 1; j <= i; ++j) {
        if (i != j) {
          prod = prod.multiply(innerSum(s, IntegerUtils.lcm(i, j)).pow(s[i] * s[j] * IntegerUtils.gcd(i, j)));
        } else if ((i & 1) == 1) {
          prod = prod.multiply(innerSum(s, i).pow((i * s[i] * s[i] - s[i]) / 2));
        } else {
          prod = prod.multiply(innerSum(s, i).pow((i * s[i] * s[i] - 2 * s[i]) / 2)).multiply(innerSum(s, i / 2).pow(s[i]));
        }
      }
    }
    return prod;
  }
}
