package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a005.A005439;

/**
 * A000366 Genocchi numbers of second kind <code>(A005439)</code> divided by <code>2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A000366 extends A005439 {

  @Override
  public Z next() {
    return super.next().shiftRight(mN - 1);
  }
}
