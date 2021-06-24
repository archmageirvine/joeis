package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A048608 Denominators of coefficients in function a(x) such that a(a(x)) = log(1+x).
 * @author Sean A. Irvine
 */
public class A048608 extends A048607 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

