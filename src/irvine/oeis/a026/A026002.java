package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026002 a(n) = T(n,n+2), where T = Delannoy triangle (A008288).
 * @author Sean A. Irvine
 */
public class A026002 extends A008288 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 2);
  }
}
