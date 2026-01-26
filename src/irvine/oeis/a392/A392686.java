package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A392686 a(n) = denominator( (1/(4*n + 2))*Sum_{i=0..2*n} (-1)^i/(2*i+1) ).
 * @author Sean A. Irvine
 */
public class A392686 extends A392685 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
