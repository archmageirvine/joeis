package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085882 a(1) = 2, a(n) = smallest prime of the form 2*k*prime(n)*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A085882 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    }
    final Z t = mA.multiply(super.next()).multiply(2);
    mA = t.add(1);
    while (!mA.isProbablePrime()) {
      mA = mA.add(t);
    }
    return mA;
  }
}
