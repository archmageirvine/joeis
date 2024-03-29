package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003164 Numerators of Van der Pol numbers.
 * @author Sean A. Irvine
 */
public class A003164 extends A003163 {

  @Override
  protected Z res(final Q n) {
    return n.num();
  }
}
