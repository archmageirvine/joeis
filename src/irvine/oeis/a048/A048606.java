package irvine.oeis.a048;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A048606 Numerators of coefficients in function a(x) such that a(a(x)) = sinh(x).
 * @author Sean A. Irvine
 */
public class A048606 extends A048602 {

  @Override
  protected Z select(final Q n) {
    return (mN & 2) == 0 ? n.num() : n.num().negate();
  }
}

