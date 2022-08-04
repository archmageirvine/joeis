package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a047.A047998;

/**
 * A058300 Number of ways of piling up n wine bottles above a row of n+1 bottles at ground level.
 * @author Sean A. Irvine
 */
public class A058300 extends A047998 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, 0).coeff(mN + 1);
  }
}
