package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a340.A340811;

/**
 * A340814.
 * @author Sean A. Irvine
 */
public class A063687 extends A340811 {

  private int mN = -1;

  @Override
  public Z next() {
    return s(b(++mN, 3), 3).coeff(mN);
  }
}

