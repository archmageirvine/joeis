package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062070 Smallest base b such that the decimal digits of n interpreted as digits in base b give a square, or 0 if no such base exists.
 * @author Sean A. Irvine
 */
public class A062070 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long b = 2; b <= mN + 2; ++b) {
      long m = mN;
      Z mul = Z.ONE;
      Z a = Z.ZERO;
      while (m != 0) {
        a = a.add(mul.multiply(m % 10));
        mul = mul.multiply(b);
        m /= 10;
      }
      if (a.isSquare()) {
        return Z.valueOf(b);
      }
    }
    return Z.ZERO;
  }
}
