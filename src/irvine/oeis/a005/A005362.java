package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005362.
 * @author Sean A. Irvine
 */
public class A005362 extends A005364 {

  private long mN = -1;

  @Override
  public Z next() {
    return hoggatt(4, ++mN);
  }
}
