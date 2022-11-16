package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A057862 a(n) = 2^n mod Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A057862 extends A000045 {

  private Z mA = Z.ONE;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply2();
    return mA.mod(super.next());
  }
}
