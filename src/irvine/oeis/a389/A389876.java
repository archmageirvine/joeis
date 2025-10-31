package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389876 Number of digits in denominators of zeta(2*n)/Pi^(2*n).
 * @author Sean A. Irvine
 */
public class A389876 extends A389877 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

