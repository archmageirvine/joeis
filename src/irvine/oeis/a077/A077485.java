package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077485 a(1) = 1, then smallest n-digit square which leaves a square at every step if most significant digit and least significant digit are deleted until a one-or two-digit digit square is obtained. a(2n) = 0 if no such square exists. a(2n+1) = 10^2n only if no nontrivial candidate exists.
 * @author Sean A. Irvine
 */
public class A077485 extends Sequence1 {

  private static final long[] SMALL = {1, 16, 144, 1369, 10816};
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      return Z.valueOf(SMALL[(int) mN - 1]);
    }
    switch ((int) (mN & 3)) {
      case 1:
        return Z.TEN.pow(mN - 1);
      case 3:
        return Z.TEN.pow(2 * (mN / 4) + 1).add(2).square();
      default:
      //case 0:
      //case 2:
        return Z.ZERO;
    }
  }
}

