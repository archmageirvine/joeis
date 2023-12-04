package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067126 extends A000010 {

  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z phi = super.next();
      if (phi.compareTo(mMax) >= 0) {
        mMax = phi;
        return Z.valueOf(mN);
      }
    }
  }
}
