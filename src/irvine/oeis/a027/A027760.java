package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A027760.
 * @author Sean A. Irvine
 */
public class A027760 extends A027759 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}
