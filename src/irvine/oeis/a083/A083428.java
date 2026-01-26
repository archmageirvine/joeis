package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A083428 Smallest prime that can be formed using the digits of first 3n+1 numbers, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083428 extends Sequence1 {

  private int mN = 0;
  private int mM = 1;
  private final int[] mCounts = {0, -1, 0, 0, 0, 0, 0, 0, 0, 0}; // first 1 is implicit

  @Override
  public Z next() {
    ++mN;
    while (mM <= 3 * mN + 1) {
      final int[] c = ZUtils.digitCounts(mM);
      for (int k = 0; k < mCounts.length; ++k) {
        mCounts[k] += c[k];
      }
      ++mM;
    }
    final StringBuilder s = new StringBuilder().append('1');
    for (int k = 0; k < mCounts.length; ++k) {
      s.append(String.valueOf(k).repeat(mCounts[k]));
    }
    final Z v = new Z(s);
    if (v.isProbablePrime()) {
      return v;
    }
    Z min = null;
    Z mod = Z.ONE;
    while (min == null) {
      // Try permutations of increasing numbers of trailing digits
      mod = mod.multiply(10);
      final Z[] qr = v.divideAndRemainder(mod);
      final Z g = qr[0].multiply(mod);
      final Permutation perm = Permutation.permuter(qr[1]);
      perm.next(); // skip identity
      int[] p;
      while ((p = perm.next()) != null) {
        final Z h = g.add(Permutation.permToZ(p));
        if ((min == null || h.compareTo(min) < 0) && h.isProbablePrime()) {
          min = h;
        }
      }
    }
    return min;
  }
}
