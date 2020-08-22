package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

import java.util.Arrays;

/**
 * A003407 Number of permutations of [n] with no 3-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A003407 implements Sequence {

  private LongDynamicArray<int[]> mSoln = new LongDynamicArray<>();
  private int mN = -1;

  private static boolean test(final int[] perm, final int pos) {
    for (int a = 0; a <= pos; ++a) {
      for (int b = perm.length - 1; b >= pos; --b) {
        final int s = perm[a] + perm[b];
        if ((s & 1) == 0) {
          final int t = s >>> 1;
          for (int k = a + 1; k < b; ++k) {
            if (perm[k] == t) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  private static int[] extend(final int[] existing, final int pos, final int n) {
    final int[] res = Arrays.copyOf(existing, existing.length + 1);
    System.arraycopy(res, pos, res, pos + 1, existing.length - pos);
    res[pos] = n;
    return test(res, pos) ? res : null;
  }

  @Override
  public Z next() {
    ++mN;
    if (mSoln.length() == 0) {
      // Trivial case
      mSoln.set(0, new int[0]);
    } else {
      // Attempt to add mN at all possible places in existing solutions
      final LongDynamicArray<int[]> nextSoln = new LongDynamicArray<>();
      for (long k = 0; k < mSoln.length(); ++k) {
        final int[] existingSolution = mSoln.get(k);
        for (int j = 0; j <= existingSolution.length; ++j) {
          final int[] s = extend(existingSolution, j, mN);
          if (s != null) {
            nextSoln.set(nextSoln.length(), s);
          }
        }
      }
      mSoln = nextSoln;
    }
    return Z.valueOf(mSoln.length());
  }
}
