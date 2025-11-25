package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A390774.
 * @author Sean A. Irvine
 */
public class A390670 extends Sequence0 {

  // After John Tyler Rascoe

  private int mN = 0;
  private int mM = -1;
  private Z[] mRow = {Z.ONE};

  private int[] letters(final int n) {
    final int[] res = new int[2 * n - 2];
    int k = 0;
    for (int j = 2; j < n; ++j) {
      res[k++] = j;
    }
    for (int j = 1; j <= n; ++j) {
      res[k++] = j;
    }
    return res;
  }

  private int setSize(final List<Integer> w) {
    long s = 0;
    for (final int v : w) {
      s |= 1L << (v - 1);
    }
    return Long.bitCount(s);
  }

  // Returns the size of the maximal subset C of S for x
  private int findC(final ArrayList<Integer> x) {
    final long lim = 1L << mN; // note this differs from Rascoe in that we try all possible sets
    final long[] z = new long[x.size()];
    // Pre-convert x into bits for faster set checking (note maintains order relationship)
    final long[] bits = new long[x.size()];
    for (int k = 0; k < bits.length; ++k) {
      bits[k] = 1L << (x.get(k) - 1);
    }
    // Try sets in decreasing size
    for (int i = mN; i > 0; --i) {
      for (long j = (1L << i) - 1; j < lim; j = Functions.SWIZZLE.l(j)) {
        int u = 0;
        for (final long v : bits) {
          if ((j & v) != 0) { // -1 moves 1..n to 0..(n-1)
            z[u++] = v;
          }
        }
        if (u < 2) {
          return u;
        }
        for (int k = 1; k < u; ++k) {
          if (z[k] < z[k - 1]) {
            break;
          } else if (k == u - 1) {
            return i; // size of set
          }
        }
      }
    }
    throw new RuntimeException();
  }

  private ArrayList<Integer> removePosition(final ArrayList<Integer> w, final int pos) {
    final ArrayList<Integer> res = new ArrayList<>(w.size() - 1);
    for (int k = 0; k < w.size(); ++k) {
      if (k != pos) {
        res.add(w.get(k));
      }
    }
    return res;
  }

  // Returns the C-reduced word of w by removing letters if possible, starting from left to right
  private ArrayList<Integer> reduce(final int[] w) {
    ArrayList<Integer> w0 = new ArrayList<>();
    for (final int v : w) {
      w0.add(v);
    }
    final int slen = setSize(w0);
    final int c = findC(w0);
    for (int i = 0, r = 0; i < w.length; ++i) {
      final ArrayList<Integer> w1 = removePosition(w0, i - r);
      if (findC(w1) == c && setSize(w1) == slen) {
        w0 = w1; // Remove was safe
        ++r;
      }
    }
    return w0;
  }

  private void step(final int n) {
    if (n == 1) {
      mRow = new Z[] {Z.ZERO, Z.ONE};
      return;
    }
    mRow = new Z[n + 1];
    Arrays.fill(mRow, Z.ZERO);
    final HashSet<List<Integer>> seen = new HashSet<>();
    for (int i = n; i <= 2 * (n - 1); ++i) {
      final Permutation perm = new Permutation(letters(n));
      int[] p;
      while ((p = perm.next()) != null) {
        final ArrayList<Integer> r = reduce(p);
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
      step(++mN);
      mM = 0;
    }
    return mRow[mM];
  }
}
