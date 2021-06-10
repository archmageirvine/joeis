package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a343.A343092;

/**
 * A006427 Number of rooted toroidal maps with 4 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006427 extends A343092 {

  private int mN = 4;

  @Override
  public Z next() {
    return h(++mN, 1).coeff(mN - 5).toZ();
  }
}
