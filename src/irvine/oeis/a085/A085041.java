package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085041 a(1) = 2, a(n+1) = smallest prime of the form a(n) + k*prime(n+1), k &gt;1.
 * @author Sean A. Irvine
 */
public class A085041 extends A000040 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    }
    final Z p = super.next();
    mA = mA.add(p);
    do {
      mA = mA.add(p);
    } while (!mA.isProbablePrime());
    return mA;
  }
}
