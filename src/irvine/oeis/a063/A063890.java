package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063890 Number of solutions to +- 1 +- 2 +- 3 +- ... +- n = n.
 * @author Sean A. Irvine
 */
public class A063890 extends A063866 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
