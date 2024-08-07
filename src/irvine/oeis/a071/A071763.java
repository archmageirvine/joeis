package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071763 Number of spanning trees in n X n X n grid.
 * @author Sean A. Irvine
 */
public class A071763 extends Sequence1 {

  private int mN = 0;

  private CR cos(final int k, final int n) {
    return CR.PI.multiply(k).divide(n).cos();
  }

  @Override
  public Z next() {
    ++mN;
    final CR[] cos = new CR[mN];
    for (int k = 0; k < mN; ++k) {
      cos[k] = cos(k, mN);
    }
    CR prod = CR.ONE;
    for (int n1 = 0; n1 < mN; ++n1) {
      for (int n2 = 0; n2 < mN; ++n2) {
        for (int n3 = 0; n3 < mN; ++n3) {
          if (n1 != 0 || n2 != 0 || n3 != 0) {
            prod = prod.multiply(CR.THREE.subtract(cos[n1]).subtract(cos[n2]).subtract(cos[n3]));
          }
        }
      }
    }
    final long n3 = (long) mN * mN * mN;
    return prod.multiply(Z.ONE.shiftLeft(n3 - 1)).divide(n3).assumeInt().toZ();
  }
}
