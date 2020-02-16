package irvine.oeis.a028;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A028939.
 * @author Sean A. Irvine
 */
public class A028939 extends A028938 {

  @Override
  protected Z select(final Q y) {
    return y.den();
  }
}

