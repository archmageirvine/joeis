package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A008304. Uses recurrence by Max A. Alekseyev.
 * @author Sean A. Irvine
 */
public class A008304 implements Sequence {

  private static final HashMap<String, Z> CACHE = new HashMap<>();

  /**
   * Useful recurrence to computing this type of sequence. Returns the number
   * of permutations of order <code>n</code> whose increasing runs length
   * does not exceed <code>k</code>, and the final increasing run (if it is
   * present) has length at most <code>j</code>.
   * @param n order of permutation
   * @param k maximal sequence length
   * @param j index
   * @return number of permutations
   */
  public static Z u(final int n, final int k, final int j) {
    if (j < 1) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    final String key = n + "_" + k + "_" + "_" + j;
    final Z v = CACHE.get(key);
    if (v != null) {
      return v;
    }
    Z sum = u(n - 1, k, j).add(u(n - 1, k, j - 1));
    for (int t = 2; t < n; ++t) {
      sum = sum.add(Binomial.binomial(n - 1, t - 1).multiply(u(t - 1, k, k - 1)).multiply(u(n - t, k, j)));
    }
    CACHE.put(key, sum);
    return sum;
  }

  protected Z i(final int n, final int p) {
    return u(n, p, p).subtract(u(n, p - 1, p - 1));
  }

  protected int mN = 0;
  private int mP = 0;

  @Override
  public Z next() {
    if (mP >= mN) {
      ++mN;
      mP = 0;
    }
    return i(mN, ++mP);
  }

}


