package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a078.A078099;

/**
 * A068220.
 * @author Sean A. Irvine
 */
public class A068253 extends A078099 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
