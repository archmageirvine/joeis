package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073689.
 * @author Sean A. Irvine
 */
public class A073692 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 1;
      return Z.ONE;
    }
    Z prod = Z.valueOf(mN);
    mN += 2;
    while (!prod.add(2).isProbablePrime()) {
      prod = prod.multiply(mN);
      mN += 2;
    }
    return Z.valueOf(mN);
  }
}
