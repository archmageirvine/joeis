package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064278 Numbers k such that k! + prime(k) is prime.
 * @author Sean A. Irvine
 */
public class A064278 extends A000040 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mF.add(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
