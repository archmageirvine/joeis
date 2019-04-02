package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A002670 Denominator of constant term in polynomial arising from numerical integration formula.
 * @author Sean A. Irvine
 */
public class A002670 extends A002669 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
