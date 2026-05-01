package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A395448 Denominators of the coefficient of Pi^(4n+1) in Plouffe's formula for zeta(4n+1).
 * @author Sean A. Irvine
 */
public class A395448 extends A395447 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
