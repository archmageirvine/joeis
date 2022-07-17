package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a036.A036013;

/**
 * A058000 a(n) is smallest prime such that a(n)+1 is a proper multiple of a(n-1)+1 [with a(1)=1].
 * @author Sean A. Irvine
 */
public class A058000 extends A036013 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(super.next());
    return mA.subtract(1);
  }
}
