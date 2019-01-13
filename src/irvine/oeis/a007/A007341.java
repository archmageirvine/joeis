package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007341.
 * @author Sean A. Irvine
 */
public class A007341 implements Sequence {

  private int mN = 0;

  private CR[] cosines(final int n) {
    final CR[] cosines = new CR[n];
    final CR crn = CR.valueOf(n);
    for (int k = 0; k < mN; ++k) {
      cosines[k] = CR.PI.multiply(CR.valueOf(k)).divide(crn).cos();
    }
    return cosines;
  }

  @Override
  public Z next() {
    final CR[] cosines = cosines(++mN);
    CR prod = CR.ONE;
    for (int i = 1; i < mN; ++i) {
      for (int j = 1; j < mN; ++j) {
        final CR t = CR.TWO.subtract(cosines[i]).subtract(cosines[j]);
        prod = prod.multiply(t);
      }
    }
    return prod.shiftLeft((mN - 1) * (mN - 1)).add(CR.HALF).floor(32);
  }
}
