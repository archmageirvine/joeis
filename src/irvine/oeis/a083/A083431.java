package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A083431 Largest multiple of n that can be formed using the digits of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A083431 extends Sequence1 {

  protected int mN = 0;
  private final int[] mCounts = new int[10];

  @Override
  public Z next() {
    ++mN;
    final int[] c = ZUtils.digitCounts(mN);
    for (int k = 0; k < mCounts.length; ++k) {
      mCounts[k] += c[k];
    }
    final StringBuilder s = new StringBuilder();
    for (int k = mCounts.length - 1; k >= 0; --k) {
      s.append(String.valueOf(k).repeat(mCounts[k]));
    }

    // Check if we already have the required number
    final Z v = new Z(s);
    if (v.mod(mN) == 0) {
      return v;
    }

    // Try permutations of increasing numbers of trailing digits
    Z max = Z.ZERO;
    Z mod = Z.TEN;
    while (max.isZero()) {
      mod = mod.multiply(10);
      final Z[] qr = v.divideAndRemainder(mod);
      final Z g = qr[0].multiply(mod);
      final Permutation perm = Permutation.permuter(qr[1]);
      int[] p;
      while ((p = perm.next()) != null) {
        final Z h = g.add(Permutation.permToZ(p));
        if (h.compareTo(max) > 0 && h.mod(mN) == 0) {
          max = h;
        }
      }
    }
    return max;
  }
}
