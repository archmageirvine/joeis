package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007306.
 * @author Sean A. Irvine
 */
public class A007306 extends A007305 {

  @Override
  protected Z select(final Z num, final Z den) {
    return den;
  }
}
