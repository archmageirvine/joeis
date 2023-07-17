package irvine.oeis.a211;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A211318 Triangle read by rows: number of permutations of 1..n by length l of longest run (n &gt;= 1, 1 &lt;= l &lt;= n).
 * @author Sean A. Irvine
 */
public class A211318 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A211318(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A211318() {
    super(1);
  }

  private static final HashMap<String, Z> CACHE = new HashMap<>();

  /**
   * Useful recurrence to computing this type of sequence. Returns the number
   * of permutations of order <code>n</code> whose increasing runs length
   * does not exceed <code>k</code>, and the final increasing run (if it is
   * present) has length at most <code>j</code>.
   * @param n order of permutation
   * @param k maximal sequence length
   * @param i index
   * @param j index
   * @return number of permutations
   */
  public static Z b(final int n, final int k, final int i, final int j) {
    if (i < 1 || j < 1) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    final String key = n + "_" + k + "_" + i + "_" + j;
    final Z v = CACHE.get(key);
    if (v != null) {
      return v;
    }
    Z sum = b(n - 1, k, i - 1, j).add(b(n - 1, k, i, j - 1));
    for (int t = 2; t < n; ++t) {
      sum = sum.add(Binomial.binomial(n - 1, t - 1).multiply(b(t - 1, k, i, k - 1)).multiply(b(n - t, k, k - 1, j)));
    }
    CACHE.put(key, sum);
    return sum;
  }

  protected Z a(final int n, final int p) {
    return b(n, p, p, p).subtract(b(n, p - 1, p - 1, p - 1));
  }

  private int mN = 0;
  private int mP = 0;

  @Override
  public Z next() {
    if (mP >= mN) {
      ++mN;
      mP = 0;
    }
    return a(mN, ++mP);
  }

}

