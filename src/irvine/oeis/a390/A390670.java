package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A390670 Triangle read by rows: T(n,k) is the number of irreducible words covering the alphabet [n] such that the maximal cardinality of C is k, where C is a subset of the alphabet such that all letters in C appear in weakly increasing order within the word.
 * @author Sean A. Irvine
 */
public class A390670 extends Sequence0 {

  // After John Tyler Rascoe

  private int mN = 0;
  private int mM = -1;
  protected Z[] mRow = {Z.ONE};

  private int[] letters(final int n) {
    // Rather than 1..n, we use 1,2,4,...,2^n so we can use bitsets
    final int[] res = new int[2 * n - 2];
    int k = 0;
    for (int j = 2; j < n; ++j) {
      res[k++] = 1 << (j - 1);
    }
    for (int j = 1; j <= n; ++j) {
      res[k++] = 1 << (j - 1);
    }
    return res;
  }

  private int setSize(final List<Integer> w) {
    int s = 0;
    for (final int v : w) {
      s |= v;
    }
    return Integer.bitCount(s);
  }

  private boolean is(final List<Integer> x, final int j) {
    int w = 0;
    for (final int v : x) {
      if ((j & v) != 0) {
        if (w > 0 && v < w) {
          return false;
        }
        w = v;
      }
    }
    return true;
  }

  // Returns the size of the maximal subset C of S for x
  private int findC(final List<Integer> x) {
    final int lim = 1 << mN; // note this differs from Rascoe in that we try all possible sets
    // Try sets in decreasing size
    for (int i = mN; i > 0; --i) {
      for (int j = (1 << i) - 1; j < lim; j = Functions.SWIZZLE.i(j)) {
        if (is(x, j)) {
          return i;
        }
      }
    }
    throw new RuntimeException();
  }

  private List<Integer> removePosition(final List<Integer> w, final int pos) {
    final ArrayList<Integer> res = new ArrayList<>(w.size() - 1);
    for (int k = 0; k < w.size(); ++k) {
      if (k != pos) {
        res.add(w.get(k));
      }
    }
    return res;
  }

  // Returns the C-reduced word of w by removing letters if possible, starting from left to right
  private List<Integer> reduce(final int[] w) {
    List<Integer> w0 = IntegerUtils.toList(w);
    final int slen = setSize(w0);
    final int c = findC(w0);
    for (int i = 0, r = 0; i < w.length; ++i) {
      final List<Integer> w1 = removePosition(w0, i - r);
      if (setSize(w1) == slen && findC(w1) == c) {
        w0 = w1; // Remove was safe
        ++r;
      }
    }
    return w0;
  }

  // Builds row n
  protected void step() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    if (mN == 1) {
      mRow = new Z[] {Z.ZERO, Z.ONE};
      return;
    }
    mRow = new Z[mN + 1];
    Arrays.fill(mRow, Z.ZERO);
    final HashSet<List<Integer>> seen = new HashSet<>();
    for (int i = mN; i <= 2 * (mN - 1); ++i) {
      final Permutation perm = new Permutation(letters(mN));
      int[] p;
      while ((p = perm.next()) != null) {
        final List<Integer> r = reduce(p);
        if (setSize(r) == mN && seen.add(r)) {
          final int c = findC(r);
          mRow[c] = mRow[c].add(1);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      step();
      mM = 0;
    }
    return mRow[mM];
  }
}
