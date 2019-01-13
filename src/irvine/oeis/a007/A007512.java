package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A007512.
 * @author Sean A. Irvine
 */
public class A007512 extends A001113 {

  private Z mE = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mE = mE.multiply(10).add(super.next());
      if (mE.isProbablePrime()) {
        return mE;
      }
    }
  }
}
