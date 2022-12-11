package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a001.A001566;

/**
 * A058635 a(n) = Fibonacci(2^n).
 * @author Sean A. Irvine
 */
public class A058635 extends A001566 {

  private boolean mFirst = true;
  private Z mA = null;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    mA = mA == null ? Z.ONE : mA.multiply(super.next());
    return mA;
  }
}
