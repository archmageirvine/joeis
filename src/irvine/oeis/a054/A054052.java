package irvine.oeis.a054;

import irvine.math.z.Z;

/**
 * A054052 Number of nonisomorphic n-state automata with binary inputs and outputs.
 * @author Sean A. Irvine
 */
public class A054052 extends A054050 {

  protected Z fix(final int[] j) {
    Z prod = Z.ONE;
    for (int i = 1; i < j.length; ++i) {
      long sum = 0;
      for (int d = 1; d <= i; ++d) {
        if (j[i] > 0 && i % d == 0) {
          sum += 2L * d * j[d];
        }
      }
      prod = prod.multiply(Z.valueOf(sum).pow(2L * j[i]));
    }
    return prod;
  }
}
