package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001655 Fibonomial coefficients: <code>a(n) =</code> F(n+1)*F(n+2)*F(n+3)/2, where F() = Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A001655 extends A000045 {

  {
    super.next();
  }

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.multiply(mA).multiply(mB).divide(2);
    mA = mB;
    mB = t;
    return r;
  }
}
