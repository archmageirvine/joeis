package irvine.oeis.a068;

import irvine.math.IntegerUtils;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068330 Consider all sublists of [(2,1),(3,2,1),(4,3,2,1),...,(n,...,4,3,2,1)] and multiply these permutations in that order. How many of the products are n-cycles?.
 * @author Sean A. Irvine
 */
public class A068330 extends Sequence1 {

  private int mN = 0;

  private int image(final int len, final int x) {
    return x <= len ? (x == 0 ? len : x - 1) : x;
  }

  private void image(final int[] in, final int len, final int[] out) {
    for (int k = 0; k < in.length; ++k) {
      out[k] = image(len, in[k]);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long count = 0;
    int[] p = new int[mN];
    int[] q = new int[mN];
    for (long k = 1; k < 1L << (mN - 1); ++k) {
      IntegerUtils.identity(p);
      int i = 1;
      for (long j = k; j != 0; j >>>= 1, ++i) {
        if ((j & 1) == 1) {
          image(p, i, q);
          final int[] t = p;
          p = q;
          q = t;
        }
      }
      if (IntegerPermutation.maximumCycleSize(p) == mN) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
