package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063865 Number of solutions to +- 1 +- 2 +- 3 +- ... +- n = 0.
 * @author Sean A. Irvine
 */
public class A063865 extends A063866 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, 0);
  }
}
