package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067079 Right digitorial function Rd(n) = abcd...*bcd...*cd...*d...*..., for n = abcd... in decimal notation.
 * @author Sean A. Irvine
 */
public class A067079 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.valueOf(mN);
    long t = 10;
    while (t <= mN) {
      prod = prod.multiply(mN % t);
      t *= 10;
    }
    return prod;
  }
}
