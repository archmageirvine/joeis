package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002122.
 * @author Sean A. Irvine
 */
public class A002122 extends A002121 {

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
