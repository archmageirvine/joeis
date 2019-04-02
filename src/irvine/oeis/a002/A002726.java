package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A002726 a(n) = Fibonacci(n+1) mod n.
 * @author Sean A. Irvine
 */
public class A002726 extends A000045 {

  private Z mN = Z.ZERO;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return super.next().mod(mN);
  }
}
