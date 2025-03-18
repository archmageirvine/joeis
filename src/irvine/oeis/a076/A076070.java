package irvine.oeis.a076;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a053.A053067;
import irvine.util.Permutation;
import irvine.util.string.StringUtils;

/**
 * A076070.
 * @author Sean A. Irvine
 */
public class A076070 extends A053067 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int[] cnts = ZUtils.digitCounts(super.next());
    // When mN is a multiple of 10, 100, ..., we must finish with that many 0s
    long m = mN;
    Z zerosMultiplier = Z.ONE;
    while (m % 10 == 0) {
      zerosMultiplier = zerosMultiplier.multiply(10);
      m /= 10;
      if (--cnts[0] < 0) {
        return Z.ZERO; // probably never happens
      }
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k < cnts.length; ++k) {
      sb.append(String.valueOf(k).repeat(cnts[k]));
    }
    sb.insert(1, "0".repeat(cnts[0]));

    // If m is a multiple of 5, we're going to need a 5 at the end, move one there now
    // (We could also end with 0, but a solution with 5 at the end will always be smaller)
    if (m % 5 == 0) {
      final int five = sb.indexOf("5");
      // There will always be at least one five in the string
      sb.deleteCharAt(five).append('5');
    }

    // Check if we already have a solution
    final Z t = new Z(sb);
    if (mVerbose) {
      StringUtils.message("n=" + mN + " digits " + t.multiply(zerosMultiplier));
    }
    if (t.mod(m) == 0) {
      return t.multiply(zerosMultiplier);
    }
    // Permutate increasingly many trailing digits until we find a solution
    int permuteDigits = 0;
    while (true) {
      final int[] digits = new int[++permuteDigits];
      for (int k = 0; k < permuteDigits; ++k) {
        digits[k] = sb.charAt(sb.length() - permuteDigits + k) - '0';
      }
      if (mVerbose) {
        StringUtils.message("n=" + mN + " starting permutations on " + Arrays.toString(digits));
      }
      final String str = sb.substring(0, sb.length() - permuteDigits);
      final Z s = str.isEmpty() ? Z.ZERO : new Z(str).multiply(Z.TEN.pow(permuteDigits));
      final Permutation perm = new Permutation(digits);
      int[] p;
      Z best = null;
      while ((p = perm.next()) != null) {
        // For m even, the last number in the permutation must also be even.
        // This check saves having to compute the full numbers and mod in those cases
        if ((m & 1) == 0 && (p[p.length - 1] & 1) == 1) {
          continue;
        }
        final Z v = s.add(Permutation.permToZ(p));
        if (v.mod(m) == 0 && (best == null || v.compareTo(best) < 0)) {
          // it might be that the first solution found is always the best, but this guards against
          // the possibility that the pemutation engine not generating them in order
          best = v;
        }
      }
      if (best != null) {
        return best.multiply(zerosMultiplier);
      }
    }
  }
}
