package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a342.A342987;

/**
 * A006432 Number of tree-rooted planar maps with 3 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006432 extends A342987 {

  private int mN = 1;

  @Override
  public Z next() {
    return h(++mN).coeff(mN - 2);
  }
}
