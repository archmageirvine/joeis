package irvine.oeis.a086;

import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086556 Lexicographically earliest sequence of pairwise coprime numbers such that tau(a(n)) = n, where tau(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A086556 extends Sequence1 {

  private int mM = 0;
  private int mN = 0;

  private static void multiplicativePartitions(final int n, final int min, final List<int[]> result, final int[] work, final int len) {
    if (n == 1) {
      final int[] v = new int[len];
      System.arraycopy(work, 0, v, 0, len);
      result.add(v);
      return;
    }
    for (int d = min; d <= n; ++d) {
      if (n % d == 0) {
        work[len] = d;
        multiplicativePartitions(n / d, d, result, work, len + 1);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }

    final List<int[]> parts = new java.util.ArrayList<>();
    multiplicativePartitions(mN, 2, parts, new int[mN], 0);
    Z best = null;
    int bestLength = 0;
    for (final int[] part : parts) {
      Z t = Z.ONE;
      for (int j = 0; j < part.length; ++j) {
        final int exponent = part[part.length - 1 - j] - 1;
        if (exponent != 0) {
          t = t.multiply(Functions.PRIME.z(mM + j + 1).pow(exponent));
        }
      }
      if (best == null || t.compareTo(best) < 0) {
        best = t;
        bestLength = part.length;
      }
    }
    mM += bestLength;
    return best;
  }
}

