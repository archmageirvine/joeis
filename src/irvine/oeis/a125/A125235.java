package irvine.oeis.a125;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A125235 Triangle with the partial column sums of the octagonal numbers.
 * @author Georg Fischer
 */
public class A125235 extends Triangle {

  /** Construct the sequence. */
  public A125235() {
    hasRAM(false);
  }

  /* PARI:
    t(n, k) = if (n <0, 0, if (k==1, n*(3*n-2), if (k > 1, t(n-1, k-1) + t(n-1, k))));
    tabl(nn) = {for (n = 1, nn, for (k = 1, n, print1(t(n, k), ", "); ); print(); ); }
  */
  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    if (n < 0) {
      return Z.ZERO;
    }
    if (k == 1) {
      return Z.valueOf(n).multiply(3 * n - 2);
    }
    return get(n - 2, k - 2).add(get(n - 2, k - 1));
  }
}
