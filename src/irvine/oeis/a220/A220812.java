package irvine.oeis.a220;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A220812 Denominators of the Verhulst sequence x(n+1)=4*x(n)-3*x(n)^2, x(0)=1/10.
 * @author Sean A. Irvine
 */
public class A220812 extends A220811 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
