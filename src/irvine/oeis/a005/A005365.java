package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005365.
 * @author Sean A. Irvine
 */
public class A005365 extends A005364 {

  private long mN = -1;

  @Override
  public Z next() {
    return hoggatt(7, ++mN);
  }
}
