package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Pair;
import irvine.util.Permutation;

/**
 * A006219 From descending subsequences of permutations.
 * @author Sean A. Irvine
 */
public class A006219 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006219(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006219() {
    super(3);
  }

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 2;

  private Pair<Integer, Integer> max(final Pair<Integer, Integer> a, final Pair<Integer, Integer> b) {
    if (a.left().equals(b.left())) {
      return a.right() < b.right() ? a : b;
    }
    return a.left() < b.left() ? b : a;
  }

  private Pair<Integer, Integer> scan(final int[] p, final int k, final Pair<Integer, Integer> current) {
    Pair<Integer, Integer> res = current;
    for (int j = k + 1; j < p.length; ++j) {
      if (p[j] < p[k]) {
        res = max(res, scan(p, j, new Pair<>(current.left() + 1, current.right())));
      }
    }
    return res;
  }

  private long[] f(final int n) {
    final long[] f = new long[n + 1];
    final Permutation perm = new Permutation(n);
    int[] p;
    while ((p = perm.next()) != null) {
      Pair<Integer, Integer> best = new Pair<>(0, 0);
      int biggestSeen = -1;
      for (int k = 0; k < p.length; ++k) {
        if (p[k] > biggestSeen) { // Make sure it cannot extend left
          biggestSeen = p[k];
          best = max(best, scan(p, k, new Pair<>(1, p[k])));
        }
      }
      f[best.right() + 1]++; // +1 because I'm using 0..(n-1) rather than 1..n in permutations
    }
    if (mVerbose) {
      System.out.println(Arrays.toString(f));
    }
    return f;
  }

  protected Z f(final int n, final int m) {
    return Z.valueOf(f(n)[m]);
  }

  @Override
  public Z next() {
    return f(++mN, 3);
  }
}
