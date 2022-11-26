package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A060507 Denominators of the asymptotic expansion of the Airy function Ai(x).
 * @author Sean A. Irvine
 */
public class A060507 extends A060506 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
