package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026185 If n even, then 2n. If n odd, then nearest integer to 2n/3.
 * @author Sean A. Irvine
 */
public class A026185 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.multiply2() : mN.multiply(4).add(3).divide(6);
  }
}
