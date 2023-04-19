package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a092.A092517;

/**
 * A063123 Number of solutions (r,s), 0&lt; r&lt; s, to the equation 1/n = 1/r + 1/s + 1/(r*s).
 * @author Sean A. Irvine
 */
public class A063123 extends A092517 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
