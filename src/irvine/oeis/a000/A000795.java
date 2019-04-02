package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000795 Sali&#233; numbers: expansion of cosh x / cos x = Sum_{n &gt;= 0} a(n)*x^(2n)/(2n)!.
 * @author Sean A. Irvine
 */
public class A000795 extends A000364 {

  @Override
  public Z next() {
    super.next();
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(2 * mN, 2 * (mN - k)).multiply(mA364.get(k)));
    }
    return s;
  }
}
