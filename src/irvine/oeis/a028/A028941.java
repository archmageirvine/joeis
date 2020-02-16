package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028941.
 * @author Sean A. Irvine
 */
public class A028941 extends A028940 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}

