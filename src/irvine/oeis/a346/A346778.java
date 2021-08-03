package irvine.oeis.a346;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a088.A088643;

/**
 * A346778.
 * @author Sean A. Irvine
 */
public class A346778 extends A088643 {

  private int mN = 0;

  private int[] getRow(final int n) {
    // row[0] unused
    final int[] row = new int[n + 1];
    for (int k = 1; k <= n; ++k) {
      row[k] = super.next().intValueExact();
    }
    return row;
  }

  private int firstBreak(final int[] row) {
    final int n = row.length - 1;
    if (n == 1) {
      return 0;
    }
    final TreeSet<Integer> seen = new TreeSet<>();
    int g = 0;
    int firstMissing = n;
    while (++g <= n) {
      seen.add(row[g]);
      while (seen.contains(firstMissing)) {
        --firstMissing;
      }
      if (firstMissing == n - seen.size()) {
        if (row[g + 1] == n - g) {
          return g;
        }
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    return Z.valueOf(firstBreak(getRow(++mN)));
  }
}
