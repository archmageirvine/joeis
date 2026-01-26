package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A083429 Smallest multiple of n that can be formed using the digits of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A083429 extends Sequence1 {

  private int mN = 0;
  private final int[] mCounts = {0, -1, 0, 0, 0, 0, 0, 0, 0, 0}; // first 1 is implicit

  @Override
  public Z next() {
    ++mN;
    final int[] c = ZUtils.digitCounts(mN);
    for (int k = 0; k < mCounts.length; ++k) {
      mCounts[k] += c[k];
    }
    // Make some special adjustments for 10^k, 5*10^k
    long m = mN;
    int trailingZeros = 0;
    while (m % 10 == 0) {
      ++trailingZeros;
      m /= 10;
    }
    final int trailingFive = m % 5 == 0 ? 1 : 0;
    final StringBuilder s = new StringBuilder().append('1');
    mCounts[0] -= trailingZeros;
    mCounts[5] -= trailingFive;
    for (int k = 0; k < mCounts.length; ++k) {
      s.append(String.valueOf(k).repeat(mCounts[k]));
    }
    mCounts[5] += trailingFive;
    mCounts[0] += trailingZeros;
    s.append("5".repeat(trailingFive)).append("0".repeat(trailingZeros));

    // Check if we already have the required number
    final Z v = new Z(s);
    if (v.mod(mN) == 0) {
      return v;
    }

    // Try permutations of increasing numbers of trailing digits
    Z min = null;
    Z mod = Z.ONE;
    while (min == null) {
      mod = mod.multiply(10);
      final Z[] qr = v.divideAndRemainder(mod);
      final Z g = qr[0].multiply(mod);
      final Permutation perm = Permutation.permuter(qr[1]);
      perm.next(); // skip identity
      int[] p;
      while ((p = perm.next()) != null) {
        final Z h = g.add(Permutation.permToZ(p));
        if ((min == null || h.compareTo(min) < 0) && h.mod(mN) == 0) {
          min = h;
        }
      }
    }
    return min;
  }
}
