package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389343 Number of partitions of n with parts colored by {0, 1, 2} such that the sum of colors is congruent to 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A389343 extends A389342 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
