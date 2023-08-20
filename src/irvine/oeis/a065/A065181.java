package irvine.oeis.a065;

import java.util.Comparator;
import java.util.TreeSet;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.a055.A055089;

/**
 * A065181 Permutation of nonnegative integers produced when the finite permutations listed by A055089 are subjected to inverse of Foata's transformation. Inverse of A065182.
 * @author Sean A. Irvine
 */
public class A065181 extends A055089 {

  private static int findLargest(final int[] a) {
    int m = -1;
    for (int i = 0; i < a.length; ++i) {
      if (m < 0 || a[i] > a[m]) {
        m = i;
      }
    }
    return m;
  }

  private static int[] rotCycleLargestFirst(final int[] c) {
    final int x = findLargest(c);
    if (x <= 0) {
      return c;
    }
    final int[] res = new int[c.length];
    System.arraycopy(c, x, res, 0, c.length - x);
    System.arraycopy(c, 0, res, c.length - x, x);
    return res;
  }

  static int[] foataInverse(final int[] p) {
    final TreeSet<int[]> map = new TreeSet<>(Comparator.comparingInt(a -> a[0]));
    for (final int[] c : IntegerPermutation.toCycles(p)) {
      map.add(rotCycleLargestFirst(c));
    }
    final int[] res = new int[p.length];
    int k = 0;
    for (final int[] t : map) {
      System.arraycopy(t, 0, res, k, t.length);
      k += t.length;
    }
    return res;
  }

  @Override
  public Z next() {
    if (mReverseColex.isEmpty()) {
      step();
    }
    return new IntegerPermutation(foataInverse(mReverseColex.pollFirst())).permRevLexRank();
  }
}
