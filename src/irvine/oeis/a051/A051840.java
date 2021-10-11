package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a220.A220811;

/**
 * A051840 Integer part of the Verhulst sequence x(n)=x(n-1)+3*(1-x(n-1))*x(n-1), x(0)=.1.
 * @author Sean A. Irvine
 */
public class A051840 extends A220811 {

  @Override
  protected Z select(final Q n) {
    return n.toZ();
  }
}
