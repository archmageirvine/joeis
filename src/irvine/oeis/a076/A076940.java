package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a066.A066657;

/**
 * A076940 Define a mapping for a reduced rational number p/q by f(p/q) = 1 followed by p zeros followed by a 1 followed by q zeros.
 * @author Sean A. Irvine
 */
public class A076940 extends A066657 {

  @Override
  protected Z select(final Q n) {
    return Z.TEN.pow(n.num().add(n.den()).add(1)).add(Z.TEN.pow(n.den()));
  }
}
