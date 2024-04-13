package irvine.oeis.a061;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061034 Maximal number of subgroups in an Abelian group with n elements.
 * @author Sean A. Irvine
 */
public class A061034 extends Sequence1 {

  private int mN = 0;

  // Subgroups calculation after Max Alekseyev
  // See: http://home.gwu.edu/~maxal/gpscripts/

  private boolean bump(final int[] c, final int[] limits) {
    assert limits.length == c.length;
    for (int k = c.length - 1; k >= 0; --k) {
      if (++c[k] <= limits[k]) {
        for (int j = k + 1; j < c.length; ++j) {
          c[j] = c[k];
        }
        return true;
      }
      c[k] = 0;
    }
    return false;
  }

  // Number of subgroups of the group C_{p^a1} x C_{p^a2} x ... C_{p^ak} where
  // p is prime and a=[a1,a2,...,ak] with 1 <= a1 <= a2 <= ... <= ak
  private Z countSubgroups(final Z p, final int[] a, int[] b) {
    Arrays.sort(a);
    Z r = Z.ZERO;
    if (IntegerUtils.isZero(b)) {
      final int[] c = new int[a.length];
      while (bump(c, a)) {
        r = r.add(countSubgroups(p, a, c));
      }
      return r.add(1);
    }
    // Remove leading zeros from b
    int q = 0;
    while (q < b.length && b[q] == 0) {
      ++q;
    }
    if (q >= b.length) {
      return Z.ZERO;
    }
    b = Arrays.copyOfRange(b, q, b.length);
    // Initialize q, m[], n[]
    q = b.length - 1;
    final int[] m = new int[b[q]];
    final int[] n = new int[b[q]];
    int m1 = 0;
    int n1 = 0;
    for (int i = 0; i < b[q]; ++i) {
      while (i >= a[m1]) {
        ++m1;
      }
      m[i] = a.length - m1;
      while (i >= b[n1]) {
        ++n1;
      }
      n[i] = q - n1 + 1;
    }
    Z prod = Z.ONE;
    for (int i = 0; i <= q; ++i) {
      prod = prod.multiply(p.pow(m[b[q - i] - 1] - i).subtract(1));
    }
    for (int i = 0; i <= q; ++i) {
      prod = prod.divide(p.pow(n[b[q - i] - 1] - i).subtract(1));
    }
    Z sum = Z.ZERO;
    for (int x = 0; x <= q; ++x) {
      Z s = Z.ZERO;
      for (int j = x < 1 ? 1 : b[x - 1]; j < b[x]; ++j) {
        s = s.add(m[j - 1] - n[j - 1]);
      }
      sum = sum.add(s.multiply(q + 1 - x));
    }
    return prod.multiply(p.pow(sum));
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final IntegerPartition part = new IntegerPartition(fs.getExponent(p));
      int[] pi;
      Z max = Z.ZERO;
      while ((pi = part.next()) != null) {
        max = max.max(countSubgroups(p, pi, new int[] {0}));
      }
      prod = prod.multiply(max);
    }
    return prod;
  }
}
