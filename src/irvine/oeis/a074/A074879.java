package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a061.A061779;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074879 extends A061779 {

  @Override
  public Z next() {
    return Z.TEN.subtract(super.next().mod(10));
  }
}
