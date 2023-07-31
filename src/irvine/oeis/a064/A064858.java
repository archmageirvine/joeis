package irvine.oeis.a064;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A064858 Denominators of partial sums of reciprocals of lcm(1..n) = A003418(n).
 * @author Sean A. Irvine
 */
public class A064858 extends A064857 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
