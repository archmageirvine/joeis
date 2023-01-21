package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061092 a(0) = 1; for n&gt;0, a(n) = smallest prime of the form k*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A061092 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      long k = 0;
      Z t;
      while (!(t = mA.multiply(++k).add(1)).isProbablePrime()) {
        // do nothing
      }
      mA = t;
    }
    return mA;
  }
}
