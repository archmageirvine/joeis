package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002854;

/**
 * A054745 Number of nonisomorphic binary n-state automata without output under input permutations.
 * @author Sean A. Irvine
 */
public class A054745 extends A002854 {

  private static final int[][] PART2 = {{0, 2, 0}, {0, 0, 1}}; // precomputed partitions of 2 in count form

  /** Construct the sequence. */
  public A054745() {
    super(0);
  }

  @Override
  protected Q m(final int[] p) {
    // p is partition in count form
    Z sum = Z.ZERO;
      for (final int[] t : PART2) {
        Z prod = Z.ONE;
        for (int r = 1; r < p.length; ++r) {
          for (int s = 1; s < t.length; ++s) {
            final int lcm = IntegerUtils.lcm(r, s);
            int s1 = 0;
            for (int d = 1; d < p.length; ++d) {
              if (lcm % d == 0) {
                s1 += d * p[d];
              }
            }
            final int exponent = p[r] * t[s] * IntegerUtils.gcd(r, s);
            prod = prod.multiply(Z.valueOf(s1).pow(exponent));
          }
        }
        sum = sum.add(prod);
      }
    return new Q(sum.divide2());
  }
}
