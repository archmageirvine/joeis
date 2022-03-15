package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a002.A002944;

/**
 * A025558 a(n) = (n/(n+1)) * lcm(1,2,...,n+1).
 * @author Sean A. Irvine
 */
public class A025558 extends A002944 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return mN.multiply(super.next());
  }
}
