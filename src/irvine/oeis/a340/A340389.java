package irvine.oeis.a340;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A340389.
 * @author Sean A. Irvine
 */
public class A340389 implements Sequence {

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  // Acceptable numbers:
  // Note although 0 is a square it cannot appear in the solution since adding 0 will lead to a repeated number
  private static final int LIMIT = 10000000;
  private static final TreeSet<Integer> ALLOWED = new TreeSet<>();
  private static final int[] NUMS;
  static {
    final Fast prime = new Fast();
    for (long p = 2; p < LIMIT; p = prime.nextPrime(p)) {
      ALLOWED.add((int) p);
    }
    for (int k = 1; k * k < LIMIT; ++k) {
      ALLOWED.add(k * k);
    }
    NUMS = new int[ALLOWED.size()];
    int k = 0;
    for (final int v : ALLOWED) {
      NUMS[k++] = v;
    }
  }

  private static boolean forceRow(final int[] row, final int[] next, final Set<Integer> used) {
    // next[0] is defined at entry
    for (int k = 1; k < next.length; ++k) {
      final int b = row[k - 1] - next[k - 1];
      if (!ALLOWED.contains(b)) {
        return false; // not possible
      }
      if (used.contains(b)) {
        return false; // already used
      }
      for (int j = 0; j < k; ++j) {
        if (next[j] == b) {
          return false; // also already used
        }
      }
      next[k] = b;
    }
    return true;
  }

  private static boolean solve(final int[] row, final Set<Integer> used, final int remainingRows) {
    //System.out.println("Row: " + Arrays.toString(row));
    if (remainingRows == 0) {
      return true; // We are already done
    }
    // Allocate space for next row
    final int[] next = new int[row.length + 1];
    // Once the left most value of the next row is found, then the remainder of
    // that row is fixed, but we do need to check its validity.
    final int apex = row[0];
    for (int k = 0; NUMS[k] < apex; ++k) {
      final int a = NUMS[k]; // Choose left most
      next[0] = a;
      if (!used.contains(a) && forceRow(row, next, used)) {
        for (final int v : next) {
          used.add(v);
        }
        final boolean res = solve(next, used, remainingRows - 1);
        for (final int v : next) {
          used.remove(v);
        }
        if (res) {
          if (VERBOSE) {
            System.out.println(Arrays.toString(next));
          }
          return true;
        }
      }
    }
    return false;
  }

  private static boolean solve(final int apex, final Set<Integer> used, final int remainingRows) {
    if (remainingRows == 0) {
      return true; // We are already done
    }
    if (VERBOSE) {
      StringUtils.message("Trying: " + apex);
    }
    // Choose a < b children of apex to break symmetry
    for (int k = 0; 2 * NUMS[k] < apex; ++k) {
      final int a = NUMS[k];
      final int b = apex - a;
      if (ALLOWED.contains(b)) {
        used.add(a);
        used.add(b);
        final int[] row = {a, b};
        final boolean res = solve(row, used, remainingRows - 1);
        used.remove(b);
        used.remove(a);
        if (res) {
          if (VERBOSE) {
            System.out.println(Arrays.toString(row));
          }
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    for (final int apex : NUMS) {
      if (apex >= mN * (mN - 1) / 2 && solve(apex, new HashSet<>(), mN - 1)) {
        return Z.valueOf(apex);
      }
    }
    throw new UnsupportedOperationException();
  }
}

