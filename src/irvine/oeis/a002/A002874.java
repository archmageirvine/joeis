package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a162.A162663;

/**
 * A002874.
 * @author Sean A. Irvine
 */
public class A002874 extends A162663 {

  private int mN = -1;

  @Override
  public Z next() {
    return u(++mN, 3);
  }
}
