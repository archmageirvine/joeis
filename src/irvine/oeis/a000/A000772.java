package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a147.A147315;

/**
 * A000772 E.g.f. exp(tan(x) + sec(x) <code>- 1)</code>.
 * @author Sean A. Irvine
 */
public class A000772 extends A147315 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      s = s.add(super.next());
    }
    return s;
  }
}

