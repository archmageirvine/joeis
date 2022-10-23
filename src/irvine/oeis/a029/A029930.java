package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029930 If 2n = Sum 2^e_i, a(n) = Product 2^e_i.
 * @author Sean A. Irvine
 */
public class A029930 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        prod = prod.multiply(Z.ONE.shiftLeft(k));
      }
      ++k;
      m >>>= 1;
    }
    return prod;
  }
}
