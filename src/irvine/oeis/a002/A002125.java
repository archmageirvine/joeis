package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002125.
 * @author Sean A. Irvine
 */
public class A002125 extends A002124 {

  @Override
  public Z next() {
    super.next();
    Z s = Z.ZERO;
    final int n = size() - 1;
    for (int t = 0; t <= n; ++t) {
      s = s.add(get(t).multiply(get(n - t)));
    }
    return s;
  }
}
