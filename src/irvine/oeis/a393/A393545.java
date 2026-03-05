package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a391.A391498;

/**
 * A393545 a(n) is the number of four-element sets of distinct integer-sided trapezoids whose base angles are 60 degrees of total area n^2 but which cannot fill an equilateral triangular grid of side n units.
 * @author Sean A. Irvine
 */
public class A393545 extends A391498 {

  private int mN = 0;

  @Override
  protected Z select(final long prepack, final long count) {
    return Z.valueOf(prepack - count);
  }

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}

