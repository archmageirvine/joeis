package irvine.oeis.a316;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A316566 Triangle read by rows: T(n,k) is the number of elements of the group GL(2, Z(n)) with order k, 1 &lt;= k &lt;= A316565(n).
 * @author Sean A. Irvine
 */
public class A316566 extends Sequence0 {

  private int mN = 0;
  private Z[] mRow = new Z[0];
  private int mM = 0;

  private boolean isInvertible(final int a, final int b, final int c, final int d, final int n) {
    final long det = (long) a * d - (long) b * c;
    return Z.valueOf(det).gcd(Z.valueOf(n)).equals(Z.ONE);
  }

  private int mod(final long x, final int n) {
    final int r = (int) (x % n);
    return r >= 0 ? r : r + n;
  }

  private int[] multiply(final int[] x, final int[] y, final int n) {
    return new int[] {
      mod((long) x[0] * y[0] + (long) x[1] * y[2], n),
      mod((long) x[0] * y[1] + (long) x[1] * y[3], n),
      mod((long) x[2] * y[0] + (long) x[3] * y[2], n),
      mod((long) x[2] * y[1] + (long) x[3] * y[3], n)
    };
  }

  private int order(final int[] m, final int n) {
    final int[] id = {1 % n, 0, 0, 1 % n};
    int[] p = m.clone();
    int k = 1;
    while (!(p[0] == id[0] && p[1] == 0 && p[2] == 0 && p[3] == id[3])) {
      p = multiply(p, m, n);
      ++k;
    }
    return k;
  }

  protected Z[] computeRow(final int n) {
    final ArrayList<Z> counts = new ArrayList<>();
    for (int a = 0; a < n; ++a) {
      for (int b = 0; b < n; ++b) {
        for (int c = 0; c < n; ++c) {
          for (int d = 0; d < n; ++d) {
            if (isInvertible(a, b, c, d, n)) {
              final int ord = order(new int[] {a, b, c, d}, n);
              while (counts.size() < ord) {
                counts.add(Z.ZERO);
              }
              counts.set(ord - 1, counts.get(ord - 1).add(1));
            }
          }
        }
      }
    }
    return counts.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = computeRow(++mN);
      mM = 0;
    }
    return mRow[mM];
  }
}
