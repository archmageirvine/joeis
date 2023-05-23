package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063867 Number of solutions to +- 1 +- 2 +- 3 +- ... +- n = 0 or +- 1.
 * @author Sean A. Irvine
 */
public class A063867 extends A063866 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, 0).add(mB.get(mN, 1).multiply2());
  }
}
