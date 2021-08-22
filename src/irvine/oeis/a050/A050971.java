package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A050971 4*Denominator of S(n)/Pi^n, where S(n) = Sum_{k=-inf..+inf} ((4k+1)^(-n)).
 * @author Sean A. Irvine
 */
public class A050971 extends A050970 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
