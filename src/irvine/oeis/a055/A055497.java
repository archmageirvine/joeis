package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A055497 a(-1) = 4, a(0) = 5; thereafter a(n) = 4 + (Product_{k=1..n} prime(k))^2.
 * @author Sean A. Irvine
 */
public class A055497 extends A008578 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.FOUR;
    }
    mA = mA.multiply(super.next().square());
    return mA.add(4);
  }
}
