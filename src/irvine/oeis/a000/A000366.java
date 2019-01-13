package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a005.A005439;

/**
 * A000366.
 * @author Sean A. Irvine
 */
public class A000366 extends A005439 {

  @Override
  public Z next() {
    return super.next().shiftRight(mN - 1);
  }
}
