package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005366 Hoggatt sequence with parameter d=8.
 * @author Sean A. Irvine
 */
public class A005366 extends A005364 {

  private long mN = -1;

  @Override
  public Z next() {
    return hoggatt(8, ++mN);
  }
}
