package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A005675 Deficit in peeling rinds.
 * @author Sean A. Irvine
 */
public class A005675 extends Sequence1 {

  // This works, but very slow at generating terms

  private int mN = 0;

  private int peelCount(final int[] p) {
    final Set<List<Integer>> res = new HashSet<>();
    // WLOG can always assume last pick comes from the left side
    for (long peel = 0; peel < 1L << (p.length - 1); ++peel) {
      int l = 0;
      int r = p.length;
      long s = peel;
      final ArrayList<Integer> rind = new ArrayList<>(p.length);
      for (int k = 0; k < p.length; ++k) {
        rind.add((s & 1) == 0 ? p[l++] : p[--r]);
        s >>>= 1;
      }
      res.add(rind);
    }
    return res.size();
  }

  @Override
  public Z next() {
    ++mN;
    final int[] elements = new int[2 * mN];
    for (int k = 0; k < mN; ++k) {
      elements[2 * k] = k;
      elements[2 * k + 1] = k;
    }
    final Permutation perm = new Permutation(elements);
    int[] p;
    int best = 0;
    // WLOG can restrict search to permutations with first element 0
    while ((p = perm.next()) != null && p[0] == 0) {
      final int cnt = peelCount(p);
      if (cnt > best) {
        best = cnt;
      }
    }
    return Z.ONE.shiftLeft(2L * mN - 1).subtract(best);
  }
}

