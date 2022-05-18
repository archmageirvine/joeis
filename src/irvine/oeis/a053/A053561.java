package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;

/**
 * A053561 Number of ternary Lyndon words of length n with trace 0 and subtrace 2 over GF(3).
 * @author Sean A. Irvine
 */
public class A053561 extends A053548 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int r = d % 3;
      if (r != 0) {
        final int mu = Mobius.mobius(d);
        if (mu != 0) {
          sum = sum.signedAdd(mu == 1, m(mN / d, r, r));
        }
      }
    }
    return sum.divide(mN);
  }
}
