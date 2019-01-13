package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A013644.
 * @author Sean A. Irvine
 */
public class A013644 extends A003285 {

  @Override
  public Z next() {
    while (true) {
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
