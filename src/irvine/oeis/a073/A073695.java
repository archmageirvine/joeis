package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073689.
 * @author Sean A. Irvine
 */
public class A073695 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z prod = Z.valueOf(mN);
    while (!prod.add(1).isProbablePrime()) {
      mN += 2;
      prod = prod.multiply(mN);
    }
    return prod.add(1);
  }
}
