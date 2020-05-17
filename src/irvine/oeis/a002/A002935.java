package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a046.A046752;

/**
 * A002935 Number of series-reduced star graphs with n edges.
 * @author Sean A. Irvine
 */
public class A002935 extends A046752 {

  private int mM = 2;

  @Override
  public Z next() {
    ++mM;
    Z sum = Z.ZERO;
    for (int n = 2; n <= 2 * mM / 3; ++n) {
      sum = sum.add(get(n, mM).size());
    }
    return sum;
  }
}
