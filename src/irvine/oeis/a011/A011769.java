package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011769 <code>a(0) = 1, a(n+1) = 3 * a(n) - F(n)*(F(n) + 1),</code> where <code>F(n) =</code> A000045(n) is n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A011769 extends A000045 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z f = super.next();
      mA = mA.multiply(3).subtract(f.multiply(f.add(1)));
    }
    return mA;
  }
}
