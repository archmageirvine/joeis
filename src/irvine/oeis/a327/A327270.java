package irvine.oeis.a327;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A327270 The minimum number such that the concatenation of the absolute values of differences between adjacent digits of a(n) is n. Values of n which have no such a(n) are given as -1.
 * @author Sean A. Irvine
 */
public class A327270 extends Sequence1 implements DirectSequence {

  // After Andrew Howroyd

  private long mN = 0;

  /**
   * Search for a valid assignment of signed digits.
   * @param v decimal digits of n, most significant first
   * @param k current digit index
   * @param c current carry/value
   * @return result, or -1 if no assignment exists
   */
  private Z recurse(final int[] v, final int k, final int c) {
    if (k >= v.length) {
      return Z.valueOf(c);
    }
    final int d = v[k];
    // First try c - d.
    if (d <= c) {
      final Z r = recurse(v, k + 1, c - d);
      if (!r.equals(Z.NEG_ONE)) {
        return r.add(Z.valueOf(c).multiply(Z.TEN.pow(v.length - k)));
      }
    }
    // Then try c + d.
    if (c + d <= 9) {
      final Z r = recurse(v, k + 1, c + d);
      if (!r.equals(Z.NEG_ONE)) {
        return r.add(Z.valueOf(c).multiply(Z.TEN.pow(v.length - k)));
      }
    }
    return Z.NEG_ONE;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final String s = n.toString();
    final int[] v = new int[s.length()];
    for (int i = 0; i < s.length(); ++i) {
      v[i] = s.charAt(i) - '0';
    }
    for (int c = 1; c <= 9; ++c) {
      final Z r = recurse(v, 0, c);
      if (!r.equals(Z.NEG_ONE)) {
        return r;
      }
    }
    return Z.NEG_ONE;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}
