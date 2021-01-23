package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034463 Maximal number of residue classes mod n such that no subset adds to 0.
 * @author Sean A. Irvine
 */
public class A034463 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    int r = 0;
    outer:
    for (long k = 1; k < 1L << (mN - 1); ++k) {
      final int b = Long.bitCount(k);
      if (b > r) {
        final int[] w = new int[mN];
        w[0] = 1;
        int pos = -1;
        long u = k;
        while (u != 0) {
          ++pos;
          if ((u & 1) == 1) {
            final int[] x = new int[w.length];
            System.arraycopy(w, pos + 1, x, 0, mN - pos - 1);
            System.arraycopy(w, 0, x, mN - pos - 1, pos + 1);
            for (int i = 0; i < w.length; ++i) {
              w[i] += x[i];
            }
            if (w[0] > 1) {
              continue outer;
            }
          }
          u >>>= 1;
        }
        r = Long.bitCount(k);
      }
    }
    return Z.valueOf(r);
  }
}
