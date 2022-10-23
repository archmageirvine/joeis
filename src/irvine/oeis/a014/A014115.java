package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014115 Order of a certain Clifford group in dimension 2^n (the automorphism group of the Barnes-Wall lattice for n != 3).
 * @author Sean A. Irvine
 */
public class A014115 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    Z prod = Z.ONE.shiftLeft(mN).subtract(1);
    for (int k = 1; k < mN; ++k) {
      prod = prod.multiply(Z.ONE.shiftLeft(2 * k).subtract(1));
    }
    return prod.shiftLeft(mN * mN + mN + 1);
  }
}
