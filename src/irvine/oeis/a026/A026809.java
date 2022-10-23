package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026809 a(n) = 3^n*(3^n-1)*(3^n-2)/6.
 * @author Sean A. Irvine
 */
public class A026809 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    return mT.multiply(mT.subtract(1)).multiply(mT.subtract(2)).divide(6);
  }
}
