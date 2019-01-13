package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002004;

/**
 * A005006.
 * @author Sean A. Irvine
 */
public class A005006 extends A002004 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(davenportSchinzel(++mN, 5));
  }
}
