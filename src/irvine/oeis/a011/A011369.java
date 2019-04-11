package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A011369 <code>a(n+1) = a(n) -</code> F(n) if <code>&gt; 0,</code> otherwise <code>a(n) +</code> F(n), where F() are Fibonacci numbers; <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A011369 extends A000045 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      final Z f = super.next();
      final Z s = mA.subtract(f);
      mA = s.signum() > 0 ? s : mA.add(f);
    }
    return mA;
  }
}
