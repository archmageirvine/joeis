package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058956 Let S(t) = 1 + s_1*t + s_2*t^2 + ... satisfy S' = -S/(2 + S); sequence gives denominators of s_n.
 * @author Sean A. Irvine
 */
public class A058956 extends A058955 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
