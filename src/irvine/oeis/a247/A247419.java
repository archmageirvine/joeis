package irvine.oeis.a247;

import irvine.math.z.Z;
import irvine.oeis.a003.A003256;

/**
 * A247419 a(2n) = A003256(n); a(2n-1) = A003256(n) - 1.
 * @author Georg Fischer
 */
public class A247419 extends A003256 {

  private int mN = 0;
  private Z mA;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      mA = super.next();
      return mA.subtract(1);
    }
    return mA;
  }
}
