package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A002708 <code>a(n) = Fibonacci(n) mod</code> n.
 * @author Sean A. Irvine
 */
public class A002708 extends A000045 {

  private Z mN = Z.ZERO;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN);
  }
}
