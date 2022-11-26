package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.a100.A100008;

/**
 * A346773 a(n) = Sum_{d|n} m\u00f6bius(d)^n.
 * @author Georg Fischer
 */
public class A346773 extends A100008 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(2*n-1) = 0^(n-1) and a(2*n) = A034444(2*n) = A100008(n) for n > 0.
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    return ((mN & 1) == 1) ? Z.ZERO : super.next();
  }
}
