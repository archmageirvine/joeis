package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A084894.
 * @author Sean A. Irvine
 */
public class A084894 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    long c = 0;
    long pn = 0;
    final Permutation perm = new Permutation(++mN);
    final long[] seen = new long[mN];
    int[] p;
    while ((p = perm.next()) != null) {
      ++pn;
      for (int j = 0; j < mN - 1; ++j) {
        final int abs = Math.abs(p[j + 1] - p[j]);
        if (seen[abs] == pn) {
          ++c;
          break;
        }
        seen[abs] = pn;
      }
    }
    return Z.valueOf(c);
  }
}
