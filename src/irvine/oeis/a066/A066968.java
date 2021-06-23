package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a048.A048581;

/**
 * A066968 Denominators of b(n) = (1/16)^n*(4/(8*n+1) - 2/(8*n+4) - 1/(8*n+5) - 1/(8*n+6)).
 * @author Sean A. Irvine
 */
public class A066968 extends A048581 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

