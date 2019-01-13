package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003164.
 * @author Sean A. Irvine
 */
public class A003164 extends A003163 {

  protected Z res(final Q n) {
    return n.num();
  }
}
