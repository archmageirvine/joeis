package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a342.A342987;

/**
 * A006433 Number of tree-rooted planar maps with 4 vertices and n faces and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006433 extends A342987 {

  {
    setOffset(1);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return h(++mN).coeff(mN - 3);
  }
}
