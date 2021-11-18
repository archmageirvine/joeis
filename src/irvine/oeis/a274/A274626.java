package irvine.oeis.a274;
// manually prodsim/prodsi at 2021-11-18 21:59

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A274626 a(n) = Product_{i=0..2} (2^floor((n+i)/3)-1).
 * @author Georg Fischer
 */
public class A274626 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int i = 0; i <= 2; ++i) {
      prod = prod.multiply(Z.ONE.shiftLeft((mN + i) / 3).subtract(1));
    }
    return prod;
  }
}
