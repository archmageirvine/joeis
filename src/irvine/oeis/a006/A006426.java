package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a343.A343092;

/**
 * A006426 Number of rooted toroidal maps with 3 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006426 extends A343092 {

  {
    setOffset(1);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return h(++mN, 1).coeff(mN - 4).toZ();
  }
}
