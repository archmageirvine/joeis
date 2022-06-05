package irvine.oeis.a057;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A057439.
 * @author Sean A. Irvine
 */
public class A057439 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Long> mDone = new TreeSet<>();
  private final TreeSet<Long> mA = new TreeSet<>();
  {
    mA.add(0L); // n = 1
    mA.add(1L); // n = 2, special case because [0,1] is only one pair
  }
  private int mN = 2;

  private void step(final int n) {
    // WLOG can assume (n-1) is always first element of the permutation
    final int m = n - 1;
    // WLOG can assume p[0] > p[m-1]
    final Permutation perm = new Permutation(m);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] > p[m - 1]) {
        final long a = p[0] + m;
        final long b = p[m - 1] + m;
        long sumSquares = a * a + b * b; // contribution from implicit 0
        for (int k = 1; k < p.length; ++k) {
          final long t = p[k - 1] + p[k];
          sumSquares += t * t;
        }
        if (!mDone.contains(sumSquares)) {
          // This is a new value
          if (mA.add(sumSquares) && mVerbose) {
            StringUtils.message(Arrays.toString(p) + " -> " + sumSquares);
          }
        }
      }
    }
    if (mVerbose && !mA.isEmpty()) {
      StringUtils.message("n=" + n + " first=" + mA.first() + " last=" + mA.last());
    }
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      step(++mN);
    }
    final long res = mA.pollFirst();
    if (!mDone.isEmpty() && res < mDone.last()) {
      throw new RuntimeException("Heuristic failed: " + res + " < " + mDone.last());
    }
    mDone.add(res);
    return Z.valueOf(res);
  }
}
