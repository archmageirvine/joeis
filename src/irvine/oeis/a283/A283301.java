package irvine.oeis.a283;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a046.A046989;

/**
 * A283301 Numerators of coefficients at even powers in Taylor series expansion of log(x/sin(x)).
 * @author Sean A. Irvine
 */
public class A283301 extends A046989 {

  @Override
  protected Z select(final Q n) {
    return n.num().abs();
  }
}
