package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000080;

/**
 * A048781 Number of triangles in minimal triangle graphs.
 * @author Sean A. Irvine
 */
public class A048781 extends A000080 {

  @Override
  public Z next() {
    super.next();
    Z cnt = Z.ZERO;
    for (final Triangle[] t : mB) {
      cnt = cnt.add(t.length);
    }
    return cnt;
  }
}
