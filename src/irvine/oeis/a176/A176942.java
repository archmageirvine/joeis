package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.a033.A033307;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A176942 extends A033307 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(10).add(super.next());
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
