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
public class A076072 extends A053067 {

  // Idea for improvement:
  // Compute n*1, n*2, n*3, ... looking at the remainders mod next higher power of 10
  // Choose the "largest" possible remainder in terms of the combination of digits that
  // appears (i.e., 88 is larger than 96). Conjecture that a solution with that ending
  // is always possible (at least for large enough n).  Then do the same kind of
  // permutation search as below among the other digits.

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int[] cnts = ZUtils.digitCounts(super.next());
    // When mN is a multiple of 10, 100, ..., we must finish with that many 0s
    long m = mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = cnts.length - 1; k >= 0; --k) {
      sb.append(String.valueOf(k).repeat(cnts[k]));
    }

    // If m is a multiple of 5, and we have no 0, then we're going to need a 5 at the end, move one there now
    // (We could also end with 0, but a solution with 5 at the end will always be smaller)
    if (m % 5 == 0 && cnts[0] == 0) {
      final int five = sb.indexOf("5");
      // There will always be at least one five in the string
      sb.deleteCharAt(five).append('5');
    }

    // Check if we already have a solution
    final Z t = new Z(sb);
    if (mVerbose) {
      StringUtils.message("n=" + mN + " digits " + t);
    }
    if (t.mod(m) == 0) {
      return t;
    }
    // Permute increasingly many trailing digits until we find a solution
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
        if (v.mod(m) == 0 && (best == null || v.compareTo(best) > 0)) {
          // it might be that the first solution found is always the best, but this guards against
          // the possibility that the pemutation engine not generating them in order
          best = v;
        }
      }
      if (best != null) {
        return best;
      }
    }
  }
}
