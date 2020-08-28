package irvine.oeis.a034;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034463.
 * @author Sean A. Irvine
 */
public class A034463 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int r = 0;
    final int[] v = IntegerUtils.identity(new int[mN]);
    outer:
    for (long k = 1; k < 1L << (mN - 1); ++k) {
      final int b = Long.bitCount(k);
      if (b > r) {
        final int[] t = new int[b];
        long u = k;
        for (int j = 0, i = 0; j < t.length; ++i) {
          if ((u & 1) == 1) {
            t[j++] = v[i];
          }
          u >>>= 1;
        }
        final int[] w = new int[mN];
        w[0] = 1;
        for (int j = 0; j < t.length; ++j) {
          final int[] x = new int[w.length];
          int xi = 0;
          for (int i = t[j] + 1; i < mN; ++i) {
            x[xi++] = w[i];
          }
          for (int i = 0; i <= t[j]; ++i) {
            x[xi++] = w[i];
          }
          for (int i = 0; i < w.length; ++i) {
            w[i] += x[i];
          }
          if (w[0] > 1) {
            continue outer;
          }
        }
        r = Long.bitCount(k);
      }
    }
    return Z.valueOf(r);
  }
}
