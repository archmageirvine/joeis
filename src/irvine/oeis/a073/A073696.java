package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073696 Initial members of groups in A073697.
 * @author Sean A. Irvine
 */
public class A073696 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final Z t = Z.valueOf(mN);
    Z prod = t;
    while (!prod.add(1).isProbablePrime()) {
      mN += 2;
      prod = prod.multiply(mN);
    }
    return t;
  }
}
