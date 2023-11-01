package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010786 Floor-factorial numbers: a(n) = Product_{k=1..n} floor(n/k).
 * @author Sean A. Irvine
 */
public class A010786 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 1; k < mN; ++k) {
      prod = prod.multiply(mN / k);
    }
    return prod;
  }
}
