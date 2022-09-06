package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A058941 Numbers k such that 3 + (integer formed from first k digits after decimal point in Pi) is prime.
 * @author Sean A. Irvine
 */
public class A058941 extends A000796 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(10).add(super.next());
      }
      if (mA.add(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
