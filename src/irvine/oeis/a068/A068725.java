package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068725 extends A068723 {

  private int mN = -1;

  @Override
  public Z next() {
    return solenoidalFlows(6, ++mN);
  }
}
