package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001309 Order of real Clifford group L_n connected with Barnes-Wall lattices in dimension 2^n.
 * @author Sean A. Irvine
 */
public class A001309 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    Z p = Z.ONE.shiftLeft(mN).subtract(1);
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Z.ONE.shiftLeft(2L * k).subtract(1));
    }
    return p.shiftLeft((long) mN * mN + mN + 2);
  }
}
