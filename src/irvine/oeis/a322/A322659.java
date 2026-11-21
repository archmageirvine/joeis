package irvine.oeis.a322;

import irvine.math.z.Z;
import irvine.oeis.a324.A324163;

/**
 * A322659 Number of connected regular simple graphs on n labeled vertices.
 * @author Gregory Morse
 */
public class A322659 extends A324163 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(connected(mN, k));
    }
    return sum;
  }
}
