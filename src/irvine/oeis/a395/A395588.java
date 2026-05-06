package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A395588.
 * @author Sean A. Irvine
 */
public class A395588 extends Sequence0 {

  // Brute force, slow for n > 11.

  private int mN = -1;

  private int[] topdrop(final int[] p) {
    final int[] res = new int[p.length];
    final int len = p[0];
    int j = 0;
    for (int k = len + 1; k < p.length; ++k) {
      res[j++] = p[k];
    }
    for (int k = len; k >= 0; --k) {
      res[j++] = p[k];
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    int max = 1;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    final Permutation perm = new Permutation(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      long k = Permutation.pack(p);
      if (!seen.isSet(k)) {
        seen.set(k);
        int len = 1;
        while (true) {
          p = topdrop(p);
          k = Permutation.pack(p);
          if (seen.isSet(k)) {
            break;
          }
          ++len;
          seen.set(k);
        }
        if (len > max) {
          max = len;
        }
      }
    }
    return Z.valueOf(max);
  }
}
