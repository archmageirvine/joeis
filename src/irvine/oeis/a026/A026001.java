package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a008.A008288;

/**
 * A026001 <code>a(n) = T(3n,n)</code>, where T = Delannoy triangle <code>(A008288)</code>.
 * @author Sean A. Irvine
 */
public class A026001 extends A008288 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
