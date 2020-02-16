package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028937.
 * @author Sean A. Irvine
 */
public class A028937 extends A028936 {

  @Override
  protected Z select(final Q x) {
    return x.den();
  }
}

