package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051576 Order of Burnside group B(3,n) of exponent 3 and rank n.
 * @author Sean A. Irvine
 */
public class A051576 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.THREE.pow((mN * mN - mN) / 2 + 1));
    }
    return mA;
  }
}
