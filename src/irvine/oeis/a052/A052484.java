package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A052484 Let P = all numbers that can be obtained by permuting the digits of n and possibly adding or omitting zeros; a(n) = |n-q| where q in P is the closest number to n different from n (a(n)=0 if no such q exists).
 * @author Sean A. Irvine
 */
public class A052484 extends Sequence0 {

  private long mN = -1;

  private Permutation permuter(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final int sum = (int) IntegerUtils.sum(cnts);
    final int[] digits = new int[sum];
    for (int k = 0, i = 0; k < cnts.length; ++k) {
      for (int j = 0; j < cnts[k]; ++j) {
        digits[i++] = k;
      }
    }
    return new Permutation(digits);
  }

  private long permToLong(final int[] p) {
    long t = 0;
    for (int v : p) {
      t *= 10;
      t += v;
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    //long best = 0;
    long diff = Long.MAX_VALUE;
    final Permutation perm = permuter(mN * 10); // Allow an extra 0
    int[] p;
    while ((p = perm.next()) != null) {
      final long v = permToLong(p);
      if (v != mN) {
        final long d = Math.abs(mN - v);
        if (d < diff) {
          diff = d;
          //best = v;
        }
      }
    }
    return Z.valueOf(diff);
  }
}
