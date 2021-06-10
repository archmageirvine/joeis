package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a343.A343092;

/**
 * A006425 Number of rooted toroidal maps with 2 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006425 extends A343092 {

  private int mN = 2;

  @Override
  public Z next() {
    return h(++mN, 1).coeff(mN - 3).toZ();
  }
}
