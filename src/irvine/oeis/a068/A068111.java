package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068111 extends A068110 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
