package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A048603 Denominators of coefficients in function a(x) such that a(a(x)) = sin x.
 * @author Sean A. Irvine
 */
public class A048603 extends A048602 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

