package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052135 Denominators of coefficients in function a(x) such that a(a(a(x))) = sin x.
 * @author Sean A. Irvine
 */
public class A052135 extends A052132 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

