package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081996 First column of triangle A081994.
 * @author Sean A. Irvine
 */
public class A081996 extends A081994 {

  private int mN = -1;

  @Override
  public Z next() {
    mB.get(++mN, mN); // Triggers correct computation order
    return Z.valueOf(mB.get(mN, 0));
  }
}
