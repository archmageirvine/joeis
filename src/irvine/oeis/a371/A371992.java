package irvine.oeis.a371;

import irvine.math.z.Z;
import irvine.oeis.a051.A051168;
import irvine.oeis.a180.A180424;

/**
 * A371992 Number of different closest packings of equal spheres for rhombohedral crystals having repeat period n.
 * @author Sean A. Irvine
 */
public class A371992 extends A180424 {

  private final A051168 mS = new A051168();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long q = 1; q <= mN / 2; ++q) {
      if ((mN - 2 * q) % 3 != 0) {
        sum = sum.add(t(mN, q).add(mS.t(mN, q)));
      }
    }
    return sum.divide2();
  }
}
