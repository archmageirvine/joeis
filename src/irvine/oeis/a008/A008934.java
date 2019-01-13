package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a093.A093729;

/**
 * A008934.
 * @author Sean A. Irvine
 */
public class A008934 extends A093729 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, 1L);
  }
}
