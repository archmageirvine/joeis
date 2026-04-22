package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084545 Alternate number system in base 5.
 * @author Sean A. Irvine
 */
public class A084545 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    Z mul = Z.ONE;
    long m = ++mN;
    while (m > 0) {
      final long d = m % 5;
      m /= 5;
      if (d == 0) {
        res = res.add(mul.multiply(5));
        --m;
      } else {
        res = res.add(mul.multiply(d));
      }
      mul = mul.multiply(10);
    }
    return res;
  }
}
