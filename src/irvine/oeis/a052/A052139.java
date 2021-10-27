package irvine.oeis.a052;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A052139 Denominators of coefficients in function a(x) such that a(a(a(x))) = log (1+x).
 * @author Sean A. Irvine
 */
public class A052139 extends A052138 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

