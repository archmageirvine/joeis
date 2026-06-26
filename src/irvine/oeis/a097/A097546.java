package irvine.oeis.a097;

import irvine.math.z.Z;

/**
 * A097546 Denominators of "Farey fraction" approximations to Pi.
 * @author Sean A. Irvine
 */
public class A097546 extends A097545 {

  @Override
  protected Z select(final Z p, final Z q) {
    return q;
  }
}
