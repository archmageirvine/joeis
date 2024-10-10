package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072532 a(0)=1; for n&gt;0, a(n) = smallest prime of the form k*a(n-1)-1 with k&gt;1.
 * @author Sean A. Irvine
 */
public class A072532 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      long k = 1;
      Z t;
      while (!(t = mA.multiply(++k).subtract(1)).isProbablePrime()) {
        // do nothing
      }
      mA = t;
    }
    return mA;
  }
}
