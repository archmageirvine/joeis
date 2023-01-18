package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061030.
 * @author Sean A. Irvine
 */
public class A061031 extends A061030 {

  @Override
  protected Z select(final Z x, final Z y, final Z z) {
    return y;
  }
}
