package irvine.oeis.a047;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A047888 Rectangular array of numbers a(n,k) = number of permutations of n things with longest increasing subsequence of length &lt;=k (1&lt;=k&lt;=infinity), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A047888 extends A047874 {

  private int mN = 1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= m; ++k) {
      final ArrayList<Integer> l = new ArrayList<>();
      l.add(k);
      sum = sum.add(g(n - k, Math.min(n - k, k), l));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return t(mN - mM, mM);
  }
}
