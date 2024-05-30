package irvine.math.polynomial;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;

/**
 * Cycle index for <code>[S_n]^{S_2} - S_n * S_n</code>.
 * @author Sean A. Irvine
 */
public final class BarSymmetricGroupCycleIndex {

  private BarSymmetricGroupCycleIndex() {
  }

  // Needed for A005142, cf. 4.3.17 in Graphical Enumeration

  private static MultivariateMonomial contribution(final int[] j) {
    final MultivariateMonomial mm = new MultivariateMonomial();
    mm.setCoefficient(Q.ONE);
    for (int k = 1; k < j.length; k += 2) {
      if (j[k] != 0) {
        mm.add(k, j[k]);
      }
    }
    for (int k = 1; k < j.length; ++k) {
      if (j[k] != 0) {
        mm.add(2 * k, k * j[k] * (j[k] - 1) / 2 + (k / 2) * j[k]);
      }
    }
    for (int t = 1; t < j.length; ++t) {
      for (int r = 1; r < t; ++r) {
        if (j[r] != 0 && j[t] != 0) {
          mm.add(2 * Functions.LCM.i(r, t), Functions.GCD.i(r, t) * j[r] * j[t]);
        }
      }
    }
    return mm;
  }

  /**
   * Construct the cycle index for <code>[S_n]^{S_2} - S_n * S_n</code>.
   * @param n order
   * @return cycle index
   */
  public static CycleIndex barSymmetricGroupCycleIndex(final int n) {
    final CycleIndex res = new CycleIndex();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    final int[] j = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      final MultivariateMonomial cross = contribution(j);
      cross.multiply(ExtendedSymmetricGroupCycleIndex.period(j));
      res.add(cross);
    }
    //res.multiply(new Q(1, n));
    res.setName("Z_{" + n + "}'");
    return res;
  }
}
