package irvine.oeis.a030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A030052 Smallest number whose n-th power is a sum of distinct smaller positive n-th powers.
 * @author Sean A. Irvine
 */
public class A030052 extends Sequence1 {

  // This uses a time-memory trade off.  All possible sums of small values
  // are precomputed, then a backtracking search for larger values.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final List<Z> mPowers = new ArrayList<>();
  private int mN = 0;

  private Z pow(final int k) {
    while (k >= mPowers.size()) {
      mPowers.add(Z.valueOf(mPowers.size()).pow(mN));
    }
    return mPowers.get(k);
  }

  private void buildTree(final Z sum, final int m, final int k, final int c) {
    final Integer existing = mPrecomputedValues.get(sum);
    mPrecomputedValues.put(sum, existing == null ? c : Math.max(c, existing));
    for (int j = k + 1; j <= m; ++j) {
      buildTree(sum.add(pow(j)), m, j, c + 1);
    }
  }

  //private Map<Z, Integer> mPrecomputedValues = new TreeMap<>();
  private final Map<Z, Integer> mPrecomputedValues = new HashMap<>();

  private boolean searchWithTree(final Z target, final int prev, final int isSum) {
    final Integer cnt = mPrecomputedValues.get(target);
    if (cnt != null) {
      return cnt + isSum > 1;
    }
    Z kp;
    for (int k = prev + 1; (kp = pow(k)).compareTo(target) <= 0; ++k) {
      final Z remaining = target.subtract(kp);
      if (remaining.isZero()) {
        return isSum > 1;
      }
      if (searchWithTree(remaining, k, isSum + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mPowers.clear();
    mPrecomputedValues.clear();
    final int precompute = Math.min(2 * mN, 28);
    buildTree(Z.ZERO, precompute, 0, 0);

    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      final Z target = m.pow(mN);
      if (mVerbose) {
        StringUtils.message("Trying " + m + "^" + mN + " = " + target);
      }
      if (searchWithTree(target, precompute, 0)) {
        return m;
      }
    }
  }

  /**
   * Compute at specified value.
   * @param args n
   */
  public static void main(final String[] args) {
    final A030052 seq = new A030052();
    seq.mN = Integer.parseInt(args[0]) - 1;
    System.out.println(seq.next());
  }
}
