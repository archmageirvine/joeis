package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a076.A076337;

/**
 * A052333 Riesel problem: start with n; repeatedly double and add 1 until reach a prime. Sequence gives a(n) = prime reached, or 0 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A052333 extends A076337 {

  private long mNextReisel = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mNextReisel) {
      mNextReisel = super.next().longValueExact();
      return Z.ZERO;
    }
    Z n = Z.valueOf(mN);
    do {
      n = n.multiply2().add(1);
    } while (!n.isProbablePrime());
    return n;
  }
}
