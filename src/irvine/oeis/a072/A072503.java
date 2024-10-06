package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.util.Permutation;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072503 extends Sequence3 {

  private int mN = 2;

  private boolean isValidLacing(final int[] p) {
    // p is the middle part of the permutation (with 1 subtracted from each element)
    final int n2m = 2 * mN - 1;
    int a = 0;
    for (int k = 1; k < n2m; ++k) {
      final int b = p[k - 1] + 1;
      final int c = k == p.length ? n2m : p[k] + 1;
      // Check for horizontal connections
      if (b + a == n2m || b + c == n2m) {
        return false;
      }
      // Check the other necessary conditions
      if (b < mN) {
        if (a < mN && c < mN) {
          return false;
        }
      } else {
        if (a >= mN && c >= mN) {
          return false;
        }
      }
      a = b;
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Permutation perm = new Permutation(2 * mN - 2);
    int[] p;
    while ((p = perm.next()) != null) {
      if (isValidLacing(p)) {
        cnt++;
      }
    }
    return Z.valueOf(cnt / 2);
  }
}

