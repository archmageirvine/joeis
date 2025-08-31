package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a384.A384229;

/**
 * A387183 Denominators of the expected number of steps to hit the opposite corner by simple random walk on the n-cube.
 * @author Sean A. Irvine
 */
public class A387183 extends A384229 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

