package irvine.oeis.a072;

import java.util.Arrays;
import java.util.Set;

import irvine.util.Permutation;

/**
 * A072444 Number of subsets S of the power set P{1,2,...,n} such that: {1}, {2},..., {n} are all elements of S; if X and Y are elements of S and X and Y have a nonempty intersection, then the union of X and Y is an element of S. The sets S are counted modulo permutations on the elements 1,2,...,n.
 * @author Sean A. Irvine
 */
public class A072444 extends A072446 {

  private int remap(final int v, final int[] perm) {
    int res = 0;
    for (int k = 0; k < perm.length; ++k) {
      res |= ((v >>> perm[k]) & 1) << k;
    }
    return res;
  }

  @Override
  protected boolean accept(final Set<Integer> ps) {
    final int[] s = new int[ps.size()];
    int k = 0;
    for (final int v : ps) {
      s[k++] = v;
    }
    Arrays.sort(s);
    final Permutation perm = new Permutation(mN);
    perm.next(); // skip identity
    int[] p;
    while ((p = perm.next()) != null) {
      final int[] t = new int[s.length];
      for (int j = 0; j < s.length; ++j) {
        t[j] = remap(s[j], p);
      }
      Arrays.sort(t);
      if (Arrays.compare(t, s) < 0) {
        return false;
      }
    }
    return true;
  }
}

