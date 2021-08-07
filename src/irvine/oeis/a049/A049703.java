package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a005.A005598;

/**
 * A049703 a(0) = 0; for n&gt;0, a(n) = A005598(n)/2.
 * @author Sean A. Irvine
 */
public class A049703 extends A005598 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
