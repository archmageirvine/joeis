package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A035116 a(n) = tau(n)^2, where tau(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A035116 extends A000005 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
