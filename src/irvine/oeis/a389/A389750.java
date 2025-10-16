package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389750 Triangle read by rows: denominators of the almost-Riordan array ( (3 - 3*x)/(2*x^2 - 6*x + 3) | 3/(2*x^2 - 6*x + 3), (1 - 3*x - sqrt(5*x^2 - 6*x + 1))/(2*x) ).
 * @author Sean A. Irvine
 */
public class A389750 extends A389749 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
