package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a340.A340811;

/**
 * A054581 Number of unlabeled 2-trees with n nodes.
 * @author Sean A. Irvine
 */
public class A054581 extends A340811 {

  {
    setOffset(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return u(++mN, 3).coeff(mN);
  }
}
