package irvine.oeis.a038;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A038527 Same as A038528, except you may rearrange the digits before applying f; sequence gives n such that f(f(f(...(n)))) = 0 or empty.
 * @author Sean A. Irvine
 */
public class A038527 extends Sequence1 {

  private long mN = 0;

  private long f(final long n) {
    final String s = Long.toString(n);
    final String r = s.replace(String.valueOf(s.length()), "");
    return r.isEmpty() ? 0 : Long.parseLong(r);
  }

  private boolean search(final long n) {
    if (n == 0) {
      return true;
    }
    final String s = String.valueOf(n);
    final int[] d = new int[s.length()];
    long t = n;
    for (int k = 0; k < d.length; ++k, t /= 10) {
      d[k] = (int) (t % 10);
    }
    Arrays.sort(d);
    final Permutation perm = new Permutation(d);
    int[] p;
    while ((p = perm.next()) != null) {
      long u = 0;
      for (final int v : p) {
        u *= 10;
        u += v;
      }
      u = f(u);
      if (u == 0) {
        return true;
      }
      if (String.valueOf(u).length() == d.length) {
        return false;
      }
      if (search(u)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (search(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
