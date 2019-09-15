package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026000 <code>a(n) = T(2n, n)</code>, where T is the Delannoy triangle <code>(A008288)</code>.
 * @author Sean A. Irvine
 */
public class A026000 extends A008288 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
