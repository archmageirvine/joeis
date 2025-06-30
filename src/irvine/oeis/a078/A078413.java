package irvine.oeis.a078;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A078413 Smallest positive integer than cannot be obtained from exactly n copies of n using parentheses and the operations +, -, /, *, ^ and concatenation.
 * @author Sean A. Irvine
 */
public class A078413 extends Sequence1 {

  private static final int BIT_LENGTH_HEURISTIC = 20;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private int mLim = 10;

  private void add(final Set<Q> res, final Q v) {
    if (v.toZ().bitLength() < BIT_LENGTH_HEURISTIC) {
      res.add(v);
    }
  }

  private void handlePow(final Set<Q> res, final Q a, final Q b) {
    if (b.signum() < 0) {
      return;
    }
    if (!b.isInteger()) {
      return;
    }
    if (a.isZero() && b.isZero()) {
      return; // Extra restriction from Blomberg
    }
    final Z e = b.toZ();
    if (e.bitLength() > BIT_LENGTH_HEURISTIC) {
      return;
    }
    add(res, a.pow(e.longValue()));
  }

  @Override
  public Z next() {
    if (++mN == mLim) {
      mLim *= 10;
    }
    // Queue to be expanded
    // Sets with solutions using 1..n occurrences of n
    final ArrayList<Set<Q>> sets = new ArrayList<>();
    for (int k = 0; k <= mN; ++k) {
      sets.add(new HashSet<>());
    }
    // Form initial concatenations (others are possible later)
    Z v = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      v = v.multiply(mLim).add(mN);
      sets.get(k).add(new Q(v));
    }
    // Build up from the smallest sets
    for (int k = 1; k <= mN; ++k) {
      for (int j = 1; j <= k && j + k <= mN; ++j) {
        if (mVerbose) {
          StringUtils.message(mN + " Doing " + k + "/" + (mN - 1) + " substep " + j + "/" + Math.min(k, mN - k));
        }
        // Note result is always in set k + j, so there is never concurrent modification problems
        final Set<Q> res = sets.get(k + j);
        for (final Q a : sets.get(k)) {
          for (final Q b : sets.get(j)) {
            add(res, a.add(b));
            add(res, a.multiply(b));
            add(res, a.subtract(b).abs()); // This seems safe
            if (!a.isZero()) {
              add(res, b.divide(a));
            }
            if (!b.isZero()) {
              add(res, a.divide(b));
            }
            handlePow(res, a, b);
            handlePow(res, b, a);
            if (b.signum() >= 0 && a.isInteger() && b.isInteger()) {
              add(res, Q.valueOf(a.toString() + b));
            }
          }
        }
      }
    }
    long ans = 1;
    final Set<Q> setn = sets.get(mN);
    while (setn.contains(Q.valueOf(++ans))) {
      // do nothing
    }
    return Z.valueOf(ans);
  }

}

