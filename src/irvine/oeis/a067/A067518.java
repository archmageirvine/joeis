package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067518 Number of spanning trees in n X n X 2 grid.
 * @author Sean A. Irvine
 */
public class A067518 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    CR prod = CR.ONE;
    for (long k = 0; k < mN; ++k) {
      final CR ck = CR.THREE.subtract(CR.PI.multiply(k).divide(mN).cos());
      for (long j = 0; j < mN; ++j) {
        final CR cj = ck.subtract(CR.PI.multiply(j).divide(mN).cos());
        for (long i = 0; i < 2; ++i) {
          if (i + j + k > 0) {
            final CR ci = CR.PI.multiply(i).divide(CR.TWO).cos();
            prod = prod.multiply(cj.subtract(ci));
          }
        }
      }
    }
    return prod.divide(mN * mN).shiftLeft((int) (2 * mN * mN - 2)).round();
  }
}

