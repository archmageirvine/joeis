package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A000376 Topswops (2): start by shuffling n cards labeled 1..n. If top card is m, reverse order of top m cards. Repeat until 1 gets to top, then stop. Suppose the whole deck is now sorted (if not, discard this case). a(n) is the maximal number of steps before 1 got to the top.
 * @author Sean A. Irvine
 */
public class A000376 implements Sequence {

  private int mN = 0;

  private boolean isSorted(final int[] a) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] != k + 1) {
        return false;
      }
    }
    return true;
  }

  private int topswop(final int[] a) {
    int len = 0;
    do {
      ++len;
      for (int k = 0, j = a[0] - 1; k < j; ++k, --j) {
        final int t = a[k];
        a[k] = a[j];
        a[j] = t;
      }
    } while (a[0] != 1);
    return len;
  }

  private int race(final int n) {
    if (n <= 3) {
      return n - 1;
    }
    final int t = n - 1;
    final Permutation p = new Permutation(n);
    final int[] scratch = new int[n];
    int longest = 0;
    int[] a;
    while ((a = p.next())[0] != t) {
      if (a[0] != 0) {
        for (int k = 0; k < n; ++k) {
          scratch[k] = a[k] + 1;
        }
        final int len = topswop(scratch);
        if (len > longest && isSorted(scratch)) {
          longest = len;
        }
      }
    }
    return longest;
  }

  @Override
  public Z next() {
    return Z.valueOf(race(++mN));
  }

}
