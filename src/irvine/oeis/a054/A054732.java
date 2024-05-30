package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002854;

/**
 * A054732 Number of inequivalent n-state 2-input 2-output automata with respect to input and output permutations.
 * @author Sean A. Irvine
 */
public class A054732 extends A002854 {

  private static final int[][] PART2 = {{0, 2, 0}, {0, 0, 1}}; // precomputed partitions of 2 in count form

  @Override
  protected Q m(final int[] p) {
    // p is partition in count form
    Z sum = Z.ZERO;
    for (final int[] qq : PART2) {
      for (final int[] q : PART2) {
        Z prod = Z.ONE;
        for (int r = 1; r < p.length; ++r) {
          for (int s = 1; s < q.length; ++s) {
            final int lcm = Functions.LCM.i(r, s);
            int s1 = 0;
            for (int d = 1; d < p.length; ++d) {
              if (lcm % d == 0) {
                s1 += d * p[d];
              }
            }
            int s2 = 0;
            for (int d = 1; d < qq.length; ++d) {
              if (lcm % d == 0) {
                s2 += d * qq[d];
              }
            }
            final int exponent = p[r] * q[s] * Functions.GCD.i(r, s);
            prod = prod.multiply(Z.valueOf(s1).multiply(s2).pow(exponent));
          }
        }
        sum = sum.add(prod);
      }
    }
    return new Q(sum.divide(4));
  }
}
