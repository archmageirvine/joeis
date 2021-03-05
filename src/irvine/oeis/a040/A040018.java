package irvine.oeis.a040;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A040018.
 * @author Sean A. Irvine
 */
public class A040018 implements Sequence {

  private int mN = 2;

  private boolean isOk(final boolean[] seen, final int[] p) {
    Arrays.fill(seen, false);
    seen[p[p.length - 1]] = true;  // p[0] + p[n-1]
    for (int k = 1; k < p.length; ++k) {
      final int t = p[k] + p[k - 1];
      if (seen[t]) {
        return false;
      }
      seen[t] = true;
    }
    return true;
  }

  @Override
  public Z next() {
    final Permutation perm = new Permutation(++mN);
    final boolean[] seen = new boolean[2 * mN];
    long cnt = 0;
    int[] p;
    while ((p = perm.next())[0] == 0) {
      if (p[1] < p[mN - 1] && isOk(seen, p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

