package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001309 Order of real Clifford group <code>L_n</code> connected with Barnes-Wall lattices in dimension <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A001309 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    Z p = Z.ONE.shiftLeft(mN).subtract(1);
    for (int k = 1; k < mN; ++k) {
      p = p.multiply(Z.ONE.shiftLeft(2 * k).subtract(1));
    }
    return p.shiftLeft(mN * mN + mN + 2);
  }
}
