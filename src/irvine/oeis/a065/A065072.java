package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065072 Number of ways to tile a square of side 2n by dominoes (rectangles of size 2 X 1 or 1 X 2) is 2^n * a(n)^2 (see A004003).
 * @author Sean A. Irvine
 */
public class A065072 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final CR l1 = CR.valueOf(2 * ++mN + 1);
    final CR[] cos = new CR[mN + 1];
    for (int k = 1; k <= mN; ++k) {
      cos[k] = CR.PI.multiply(k).divide(l1).cos().square().multiply(4);
    }
    CR prod = CR.ONE;
    for (int q = 1; q <= mN; ++q) {
      for (int p = 1; p <= mN; ++p) {
        prod = prod.multiply(cos[q].add(cos[p]));
      }
    }
    return prod.divide(CR.valueOf(Z.ONE.shiftLeft(mN))).sqrt().round();
  }
}

