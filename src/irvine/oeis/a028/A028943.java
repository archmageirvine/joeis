package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028943.
 * @author Sean A. Irvine
 */
public class A028943 extends A028942 {

  @Override
  protected Z select(final Q q) {
    return q.den();
  }
}

