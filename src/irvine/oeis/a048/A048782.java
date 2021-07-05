package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048782 Smallest positive number of "triangular" shuffles of n(n+1)/2 cards needed to restore them to their original order.
 * @author Sean A. Irvine
 */
public class A048782 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Construct fixed permutation
    final int[] perm = new int[mN * (mN + 1) / 2];
    for (int k = 0, i = 0; k < perm.length; ++i) {
      for (int j = 0; j <= i; ++j, ++k) {
        perm[k] = i + mN * j - (j + 1) * j / 2;
      }
    }
    // Determine period of each position
    final long[] per = new long[perm.length];
    for (int k = 0; k < per.length; ++k) {
      int j = k;
      while ((j = perm[j]) != k) {
        ++per[k];
      }
    }
    // Find least common period
    Z lcm = Z.ONE;
    for (final long v : per) {
      lcm = lcm.lcm(Z.valueOf(v + 1));
    }
    return lcm;
  }
}
