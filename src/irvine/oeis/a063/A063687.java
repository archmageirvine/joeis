package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a340.A340811;

/**
 * A063687 Number of 2-trees rooted at any symmetric edge.
 * @author Sean A. Irvine
 */
public class A063687 extends A340811 {

  private int mN = -1;

  @Override
  public Z next() {
    return s(b(++mN, 3), 3).coeff(mN);
  }
}

