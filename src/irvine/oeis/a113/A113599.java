package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

import java.util.HashSet;

/**
 * A113599 Least n-digit multiple of n whose digit permutations yield at least n distinct multiples of <code>n,</code> or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A113599 implements Sequence {

  private int mN = 0;
  private Z mBase = Z.ONE;
  private Z mNextBase = Z.TEN;

  @Override
  public Z next() {
    if (++mN > 1) {
      mBase = mNextBase;
      mNextBase = mNextBase.multiply(10);
    }
    Z v = mBase.divide(mN).multiply(mN);
    if (v.compareTo(mBase) >= 0) {
      v = v.subtract(mN);
    }
    final HashSet<String> seen = new HashSet<>();
    while (true) {
      v = v.add(mN);
      if (v.compareTo(mNextBase) >= 0) {
        // Implies conjecture about this sequence is false
        return Z.ZERO;
      }
      int cnt = 0;
      int[] p;
      final String s = v.toString();
      final int[] base = new int[s.length()];
      for (int k = 0; k < s.length(); ++k) {
        base[k] = s.charAt(k);
      }
      final Permutation perm = new Permutation(base);
      final char[] u = new char[mN];
      while ((p = perm.next()) != null) {
        for (int k = 0; k < mN; ++k) {
          u[k] = (char) p[k];
        }
        final String t = new String(u);
        final Z z = new Z(t);
        if (z.mod(mN) == 0 && seen.add(t)) {
          if (++cnt == mN) {
            return v;
          }
        }
      }
    }
  }
}
