package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081995 Diagonal of triangle A081994.
 * @author Sean A. Irvine
 */
public class A081995 extends A081994 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, mN));
  }
}
