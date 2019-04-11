package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A008466 <code>a(n) = 2^n -</code> Fibonacci(n+2).
 * @author Sean A. Irvine
 */
public class A008466 extends A000045 {

  private Z mA = null;
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return mA.subtract(super.next());
  }
}
