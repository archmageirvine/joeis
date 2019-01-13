package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A003300.
 * @author Sean A. Irvine
 */
public class A003300 extends A003299 {

  @Override
  protected Z toZ(final Q q) {
    return q.den();
  }
}
