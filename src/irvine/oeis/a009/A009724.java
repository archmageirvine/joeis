package irvine.oeis.a009;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a008.A008961;

/**
 * A009724 Denominators of Taylor series for 1/(sin x + tan x).
 * @author Sean A. Irvine
 */
public class A009724 extends A008961 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
