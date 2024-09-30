package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000045;

/**
 * A003266 Product of first n nonzero Fibonacci numbers F(1), ..., F(n).
 * @author Sean A. Irvine
 */
public class A003266 extends A000045 implements DirectSequence {

  {
    super.next();
  }

  private Z mP = null;

  @Override
  public Z next() {
    mP = mP == null ? Z.ONE : mP.multiply(super.next());
    return mP;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z a = Z.ONE;
    Z b = Z.ZERO;
    Z prod = Z.ONE;
    for (int k = 1; k <= n; ++k) {
      final Z fib = a.add(b);
      a = b;
      prod = prod.multiply(fib);
      b = fib;
    }
    return prod;
  }

}

