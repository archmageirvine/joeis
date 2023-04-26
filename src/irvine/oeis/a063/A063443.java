package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a245.A245013;

/**
 * A063443 Number of ways to tile an n X n square with 1 X 1 and 2 X 2 tiles.
 * @author Sean A. Irvine
 */
public class A063443 extends A245013 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
