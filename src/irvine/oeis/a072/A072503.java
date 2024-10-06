package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.Permutation;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072503 extends Sequence3 {

  private int mN = 2; // Change this value for different counts

  private int e(final int[] e, final int n2, final int k) {
    if (k == 0) {
      return 1;
    }
    if (k == n2 - 1) {
      return n2;
    }
    return e[k] + 2;
  }

  private boolean isValidLacing(final int[] e, final int n2) {
    for (int k = 1; k < n2 - 1; ++k) {
      // Check for horizontal connections
      if (e[k] + e[k - 1] == n2 + 1 || e[k] + e[k + 1] == n2 + 1) {
        return false;
      }
      // Check the necessary conditions
      if (e[k] <= mN) {
        if (e[k - 1] <= mN && e[k + 1] <= mN) {
          return false;
        }
      } else {
        if (e[k - 1] > mN && e[k + 1] > mN) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final int n2 = 2 * mN;
    final int m = n2 - 2;
    final int[] e = new int[n2];
    // Fixed start and end
    e[0] = 1;
    e[n2 - 1] = n2;

    long cnt = 0;
    final Permutation perm = new Permutation(m);
    int[] p;
    while ((p = perm.next()) != null) {
      // Insert permuted path between fixed start and end
      for (int i = 0; i < m; i++) {
        e[i + 1] = p[i] + 2;
      }
      if (isValidLacing(e, n2)) {
        cnt++;
      }
    }
    return Z.valueOf(cnt / 2);
  }
}

