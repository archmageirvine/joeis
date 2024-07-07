package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071221 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod;
  }
}
