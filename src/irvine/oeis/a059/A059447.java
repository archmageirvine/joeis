package irvine.oeis.a059;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A059447 Smallest number that takes n steps to get to 1 under the map f(n)=sigma(n)-n, the sum of the proper divisors.
 * @author Sean A. Irvine
 */
public class A059447 extends Sequence0 {

  // Certain numbers like 276 have an unknown (but high) number of steps.
  // Therefore, we cannot simply compute the number of steps for each number in turn.
  // Instead, we do a dovetail calculation, keeping a set of numbers where the
  // solution has not yet been computed.
  // Over time our search accumulates some numbers that form cycles.  More
  // could be done to eliminate these.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private Map<Long, Z> mActiveNumbers = Collections.emptyMap();
  private long mM = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // First try stepping all numbers already in progress
    final Map<Long, Z> t = mActiveNumbers;
    long solved = 0;
    mActiveNumbers = new TreeMap<>();
    for (final Map.Entry<Long, Z> e : t.entrySet()) {
      final Z s = Jaguar.factor(e.getValue()).sigma().subtract(e.getValue());
      if (Z.ONE.equals(s)) {
        // This number completed on step n, but unless it is the first we don't need it
        if (solved == 0) {
          solved = e.getKey();
        }
      } else if (s.bitLength() <= 63 && s.longValue() == e.getKey()) {
        if (mVerbose) {
          StringUtils.message("Rejecting " + e.getKey() + " because a cycle was detected");
        }
      } else {
        mActiveNumbers.put(e.getKey(), s);
      }
    }
    if (solved > 0) {
      return Z.valueOf(solved);
    }
    // Otherwise, extend the numbers we are considering until we find the answer
    outer:
    while (true) {
      Z s = Z.valueOf(++mM);
      final HashSet<Z> seen = new HashSet<>();
      seen.add(s);
      for (int k = 1; k < mN; ++k) {
        s = Jaguar.factor(s).sigma().subtract(s);
        if (Z.ONE.equals(s) || !seen.add(s)) {
          if (mVerbose) {
            StringUtils.message("n=" + mN + " Rejecting " + mM + " cycled or completed in " + k + " steps");
          }
          continue outer; // Terminates before step n or enters a cycle
        }
      }
      s = Jaguar.factor(s).sigma().subtract(s);
      if (Z.ONE.equals(s)) {
        return Z.valueOf(mM);
      }
      mActiveNumbers.put(mM, s);
    }
  }
}
