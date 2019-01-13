package irvine.math.polynomial;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Digraph cycle index.
 * @author Sean A. Irvine
 */
public final class DigraphCycleIndex {

  // Discussed in Graphical Enumeration, p. 121, Eq. 5.1.5
  // S_p^{[2]}

  private DigraphCycleIndex() {
  }

  private static MultivariateMonomial getMultivariateMonomial(final int[] j) {
    final MultivariateMonomial mm = new MultivariateMonomial();
    for (int k = 1; k < j.length; ++k) {
      if (j[k] > 0) {
        mm.add(k, (k - 1) * j[k] + k * j[k] * (j[k] - 1));
      }
    }
    for (int r = 1; r < j.length; ++r) {
      if (j[r] > 0) {
        for (int t = r + 1; t < j.length; ++t) {
          if (j[t] > 0) {
            mm.add(IntegerUtils.lcm(r, t), 2 * IntegerUtils.gcd(r, t) * j[r] * j[t]);
          }
        }
      }
    }
    return mm;
  }

  /**
   * The cycle index for all digraphs of the given number of vertices
   * @param vertices number of vertices
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int vertices) {
    final CycleIndex ci = new CycleIndex("Z(S_{" + vertices + "}^{[2]})");
    final IntegerPartition ip = new IntegerPartition(vertices);
    final int[] v = new int[vertices + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, v);
      final MultivariateMonomial mm = getMultivariateMonomial(v);
      mm.setCoefficient(new Q(Z.ONE, SymmetricGroup.per(v)));
      ci.add(mm);
    }
    return ci;
  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    Z f = Z.ONE;
    for (int k = 1; k <= 12; ++k) {
      f = f.multiply(k);
      final CycleIndex ci = DigraphCycleIndex.cycleIndex(k);
      ci.multiply(new Q(f));
      System.out.println(ci);
    }
  }
}
