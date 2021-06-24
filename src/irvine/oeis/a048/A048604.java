package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A048604 Denominators of coefficients in function a(x) such that a(a(x)) = arctan(x).
 * @author Sean A. Irvine
 */
public class A048604 extends A048605 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

