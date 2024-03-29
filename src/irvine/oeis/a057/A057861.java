package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A057861 floor[2^n/Fibonacci(n)].
 * @author Sean A. Irvine
 */
public class A057861 extends A000045 {

  private Z mA = Z.ONE;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply2();
    return mA.divide(super.next());
  }
}
