package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085523 Product_{k=0..n} (4^(2k+1)+1).
 * @author Georg Fischer
 */
public class A085523 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      prod = prod.multiply(Z.ONE.shiftLeft(4 * k + 2).add(1));
    }
    return prod;
  }
}
