package irvine.oeis.a319;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a295.A295193;

/**
 * A319612 Number of regular simple graphs spanning n vertices.
 * @author Georg Fischer
 */
public class A319612 extends A295193 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : super.next().subtract(1);
  }
}
