package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003316 Sum of lengths of longest increasing subsequences of all permutations of n elements.
 * @author Sean A. Irvine
 */
public class A003316 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;

  private Z h(final int[] l) {
    final long sum = Functions.SUM.l(l);
    if (sum > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    final Z r = Functions.FACTORIAL.z((int) sum);
    final int n = l.length;
    Z p = Z.ONE;
    for (int i = 0; i < n; ++i) {
      Z q = Z.ONE;
      for (int j = 1; j <= l[i]; ++j) {
        int s = 0;
        for (int k = i + 1; k < n; ++k) {
          if (l[k] >= j) {
            ++s;
          }
        }
        q = q.multiply(Z.valueOf(1 + l[i] - j + s));
      }
      p = p.multiply(q);
    }
    assert r.mod(p).isZero();
    return r.divide(p);
  }

  private int[] expand(final int[] l, final int element, final int count) {
    final int[] lp = Arrays.copyOf(l, l.length + count);
    Arrays.fill(lp, l.length, l.length + count, element);
    return lp;
  }

  private Z g(final int n, final int i, final int[] l) {
    if (n == 0 || i == 1) {
      return h(expand(l, 1, n)).square();
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      s = s.add(g(n - i * j, i - 1, expand(l, i, j)));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(g(mN - k, k, new int[] {k}).multiply(k));
    }
    return s;
  }

}
