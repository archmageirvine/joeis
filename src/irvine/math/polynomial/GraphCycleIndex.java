package irvine.math.polynomial;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Graph cycle index.
 * @author Sean A. Irvine
 */
public final class GraphCycleIndex {

  // Discussed in Graphical Enumeration and various papers by Robinson

  private GraphCycleIndex() {
  }

  private static long getPowersOfTwo(final int[] v) {
    long powersOfTwo = 0;
    for (int k = 1; k < v.length; ++k) {
      if (v[k] > 0) {
        powersOfTwo += k * (long) v[k] * (v[k] - 1) / 2;
        powersOfTwo += ((k - 1) / 2L) * v[k];
        for (int j = k + 1; j < v.length; ++j) {
          powersOfTwo += Functions.GCD.l(j, k) * v[j] * v[k];
        }
      }
      if (2 * k < v.length) {
        powersOfTwo += v[2 * k];
      }
    }
    if (powersOfTwo > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return powersOfTwo;
  }

  static MultivariateMonomial getMultivariateMonomial(final int[] v) {
    final MultivariateMonomial mm = new MultivariateMonomial();
    for (int k = 1; k < v.length; ++k) {
      if (v[k] > 0) {
        mm.add(k, v[k]);
      }
    }
    return mm;
  }

  /**
   * The cycle index for all graphs of the given number of vertices
   * @param vertices number of vertices
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int vertices) {
    if (vertices == 0) {
      return CycleIndex.ONE;
    }
    final CycleIndex ci = new CycleIndex("Z(H" + vertices + ")");
    final IntegerPartition ip = new IntegerPartition(vertices);
    final int[] v = new int[vertices + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, v);
      final MultivariateMonomial mm = getMultivariateMonomial(v);
      mm.setCoefficient(new Q(Z.ONE.shiftLeft(getPowersOfTwo(v)), SymmetricGroup.per(v)));
      ci.add(mm);
    }
    return ci;
  }

  /**
   * The cycle index for all graphs of the given number of vertices
   * @param vertices number of vertices
   * @return cycle index
   */
  private static CycleIndex cycleIndexDeriv(final int vertices) {
    final CycleIndex ci = new CycleIndex("Z(H" + vertices + ")");
    final IntegerPartition ip = new IntegerPartition(vertices);
    final int[] v = new int[vertices + 1];
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, v);
      final MultivariateMonomial mm = getMultivariateMonomial(v);
      mm.setCoefficient(new Q(Z.valueOf(v[1]).shiftLeft(getPowersOfTwo(v)), SymmetricGroup.per(v)));
      ci.add(mm);
    }
    return ci;
  }

  /**
   * The cycle index for all graphs up to the given number of vertices
   * @param vertices number of vertices
   * @return cycle index
   */
  public static CycleIndex cycleIndexUpTo(final int vertices) {
    final CycleIndex res = new CycleIndex();
    res.add(CycleIndex.ONE);
    res.setName("Z(H)");
    for (int k = 1; k <= vertices; ++k) {
      res.add(cycleIndex(k));
    }
    return res;
  }

  /**
   * The cycle index for all graphs up to the given number of vertices
   * @param vertices number of vertices
   * @return cycle index
   */
  public static CycleIndex cycleIndexUpToDeriv(final int vertices) {
    final CycleIndex res = new CycleIndex();
    res.setName("Z(H')");
    for (int k = 1; k <= vertices; ++k) {
      res.add(cycleIndexDeriv(k));
    }
    return res;
  }
}
