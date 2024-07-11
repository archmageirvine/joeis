package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;
import irvine.util.string.StringUtils;

/**
 * A071303 1/2 times the number of n X n 0..3 matrices M with MM' mod 4 = I, where M' is the transpose of M and I is the n X n identity matrix.
 * @author Sean A. Irvine
 */
public class A071303 extends Sequence1 {

  // We avoid need for transpose as M*M^T is equivalent to various products of rows alone.
  // This means we can first compute all permissible rows (they must have dot product of 1).
  // Then combination of permissible rows (rows must have pairwise dot products of 0).
  // All rows need to be distinct and the order of the rows is irrelevant, therefore we can
  // generate with increasing row indexes and multiply by n! to get the count.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mCount = 0;

  // Build all vectors where dot product is 1
  private List<int[]> build(final int n) {
    final ArrayList<int[]> res = new ArrayList<>();
    final Bumper bump = BumperFactory.range(0, 3);
    final int[] t = new int[n];
    while (bump.bump(t)) {
      int s = 0;
      for (final int v : t) {
        s += v * v;
      }
      if ((s & 3) == 1) {
        res.add(Arrays.copyOf(t, t.length));
      }
    }
    return res;
  }

  private boolean isOk(final int[] a, final int[] b) {
    int s = 0;
    for (int i = 0; i < b.length; ++i) {
      s += a[i] * b[i];
    }
    return (s & 3) == 0;
  }

  // Precompute validity of each possible pair
  private boolean[][] checkPairs(final List<int[]> vecs) {
    final boolean[][] res = new boolean[vecs.size()][];
    for (int k = 0; k < vecs.size(); ++k) {
      res[k] = new boolean[k];
      for (int j = 0; j < k; ++j) {
        if (isOk(vecs.get(j), vecs.get(k))) {
          res[k][j] = true;
        }
      }
    }
    return res;
  }

  private boolean isOk(final boolean[][] pairs, final int[] chosen, final int t, final int k) {
    // Check that dot products with every other row is 0
    for (int j = 0; j < k; ++j) {
      if (!pairs[t][chosen[j]]) {
        return false;
      }
    }
    return true;
  }

  private void search(final List<int[]> vecs, final boolean[][] pairs, final int[] chosen, final int k, final int m) {
    if (k == chosen.length) {
      ++mCount;
      return;
    }
    for (int j = m; j < vecs.size(); ++j) {
      if (isOk(pairs, chosen, j, k)) {
        chosen[k] = j;
        search(vecs, pairs, chosen, k + 1, j + 1);
      }
    }
  }

  @Override
  public Z next() {
    // Compute the set of permissible rows
    final List<int[]> vecs = build(++mN);
    if (mVerbose) {
      StringUtils.message("Number of permissible vectors: " + vecs.size());
    }
    // Precompute which vectors can appear together
    final boolean[][] pairs = checkPairs(vecs);
    // Try all possible combinations of permissible rows
    mCount = 0;
    search(vecs, pairs, new int[mN], 0, 0);
    return Z.valueOf(mCount).multiply(Functions.FACTORIAL.z(mN)).divide2();
  }
}
