package irvine.oeis.a039;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039708 a(n) = min{m: Sum_{x=0..m} binomial(n,x) &gt;= 0.95*2^n}.
 * @author Sean A. Irvine
 */
public class A039708 implements Sequence {

  private static final Z Z95 = Z.valueOf(95);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z lim = Z95.shiftLeft(mN);
    long m = -1;
    Z sum = Z.ZERO;
    while (sum.multiply(100).compareTo(lim) < 0) {
      sum = sum.add(Binomial.binomial(mN, ++m));
    }
    return Z.valueOf(m);
  }
}
