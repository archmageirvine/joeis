package irvine.oeis.a038;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038870 Triangle read by rows: T(n,k) = number of orbits of order exactly k under doubling map which remain in a semicircle, with k dividing n.
 * @author Sean A. Irvine
 */
public class A038870 implements Sequence {

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
      if (IntegerUtils.gcd(mN, mM) == 1) {
        Z sum = Z.ZERO;
        for (int j = 0; j < mM; ++j) {
          sum = sum.add(Z.ONE.shiftLeft(mN * j / mM));
        }
        return sum;
      }
    }
  }
}
