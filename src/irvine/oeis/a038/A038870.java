package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038870 Irregular triangle read by rows: T(n,k) = number of orbits of order exactly k under doubling map which remain in a semicircle, with k dividing n.
 * @author Sean A. Irvine
 */
public class A038870 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      if (mN == 1) {
        return Z.ZERO;
      }
      if (Functions.GCD.i(mN, mM) == 1) {
        Z sum = Z.ZERO;
        for (int j = 0; j < mM; ++j) {
          sum = sum.add(Z.ONE.shiftLeft((long) mN * j / mM));
        }
        return sum;
      }
    }
  }
}
