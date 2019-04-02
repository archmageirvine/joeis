package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000375 Topswops (1): start by shuffling n cards labeled 1..n. If top card is m, reverse order of top m cards, then repeat. a(n) is the maximal number of steps before top card is 1.
 * @author Sean A. Irvine
 */
public class A000375 implements Sequence {

  private static final int MAXL = 1000;
  private int mN = 0;

  private int pepperdine(final int n) {
    final int[][] a = new int[MAXL][n + 1];
    final int[][] b = new int[MAXL][n + 1];
    final int[] x = new int[MAXL];

    a[0][0] = 1;
    int longest = -1;
    int l = 0;

    while (true) {
      final int k = ++x[l];
      if (k < n) {
        if (a[l][k] == 0) {
          if (b[l][k + 1] != 0) {
            continue;
          }
        } else if (a[l][k] != k + 1) {
          continue;
        }
        System.arraycopy(a[l], 0, a[l + 1], 0, n + 1);
        System.arraycopy(b[l], 0, b[l + 1], 0, n + 1);
        for (int j = 1; j <= k; ++j) {
          a[l + 1][j] = a[l][k - j];
        }
        a[l + 1][0] = k + 1;
        b[l + 1][k + 1] = 1;
        if (l >= longest) {
          longest = l;
        }
        x[++l] = 0;
        continue;
      }
      if (--l < 0) {
        break;
      }
    }
    return longest + 1;
  }

  @Override
  public Z next() {
    return Z.valueOf(pepperdine(++mN));
  }

}
