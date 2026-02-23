package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392511 Number of planar partitions of n where parts decrease by at most 1 along each row and column.
 * @author Sean A. Irvine
 */
public class A392511 extends Sequence0 {

  // After Ludovic Schwob

  private Set<List<List<Integer>>> mL = new HashSet<>();
  private int mN = -1;

  private static List<List<Integer>> deepCopy(final List<List<Integer>> p) {
    final List<List<Integer>> q = new ArrayList<>(p.size());
    for (final List<Integer> r : p) {
      q.add(new ArrayList<>(r));
    }
    return q;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mL.add(new ArrayList<>());
      return Z.ONE;
    }

    final Set<List<List<Integer>>> next = new HashSet<>();

    for (final List<List<Integer>> p : mL) {
      // Iterate over rows
      for (int i = 0; i < p.size(); ++i) {
        final List<Integer> row = p.get(i);

        // Case 1: append 1 to row
        if (i == 0 || row.size() < p.get(i - 1).size()) {
          final List<List<Integer>> p2 = deepCopy(p);
          final List<Integer> r2 = new ArrayList<>(row);
          r2.add(1);
          p2.set(i, r2);
          next.add(p2);
        }

        // Case 2: increment an entry
        if (i < p.size() - 1) {
          final List<Integer> below = p.get(i + 1);
          final int limit = Math.min(row.size() - 1, below.size());
          for (int j = 0; j < limit; ++j) {
            if (row.get(j).equals(row.get(j + 1))
              && row.get(j).equals(below.get(j))
              && (i == 0 || row.get(j) < p.get(i - 1).get(j))
              && (j == 0 || row.get(j) < row.get(j - 1))) {

              final List<List<Integer>> p2 = deepCopy(p);
              final List<Integer> r2 = new ArrayList<>(row);
              r2.set(j, r2.get(j) + 1);
              p2.set(i, r2);
              next.add(p2);
            }
          }
        }
      }

      // Case 3: add a new row (1)
      final List<List<Integer>> p2 = deepCopy(p);
      final List<Integer> newRow = new ArrayList<>();
      newRow.add(1);
      p2.add(newRow);
      next.add(p2);
    }
    mL = next;
    return Z.valueOf(mL.size());
  }
}
