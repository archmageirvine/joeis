package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026002 <code>a(n) = T(n,n+2)</code>, where T = Delannoy triangle <code>(A008288)</code>.
 * @author Sean A. Irvine
 */
public class A026002 extends A008288 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN + 2);
  }
}
