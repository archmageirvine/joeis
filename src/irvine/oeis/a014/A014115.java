package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014115 Order of a certain Clifford group in dimension <code>2^n</code> (the automorphism group of the Barnes-Wall lattice for <code>n != 3)</code>.
 * @author Sean A. Irvine
 */
public class A014115 implements Sequence {

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
