package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A006569.
 * @author Sean A. Irvine
 */
public class A006569 extends A006568 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
