package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076918 a(1) = 1, a(n+1) = A076271(n+1) divided by the highest common factor of A076271(n) and A076271(n+1).
 * @author Sean A. Irvine
 */
public class A076918 extends A076271 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    }
    final Z t = mA;
    mA = super.next();
    return mA.divide(Functions.GCD.z(t, mA));
  }
}
