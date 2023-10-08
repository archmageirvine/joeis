package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066321 Binary representation of base-(i-1) expansion of n: replace i-1 with 2 in base-(i-1) expansion of n.
 * @author Sean A. Irvine
 */
public class A066321 extends Sequence0 {

  private static final Z[] C = {Z.ZERO, Z.ONE, Z.valueOf(12), Z.valueOf(13)};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z res = Z.ZERO;
    long p = 0;
    while (m != 0) {
      res = res.add(C[(int) ((4 + (m & 3)) & 3)].shiftLeft(p));
      m = m > 0 ? m / -4 : (3 - m) / 4;
      p += 4;
    }
    return res;
  }
}
