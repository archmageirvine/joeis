package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389707 Triangle read by rows: denominators of the almost-Riordan array ( 3*(7 - 4*x + sqrt(1 - 8*x))/(24 - 48*x + 16*x^2 + (3*x - 3)*(1 - 4*x - sqrt(1 - 8*x))) | 24/(24 - 48*x + 16*x^2 + (3*x - 3)*(1 - 4*x - sqrt(1 - 8*x))), (1 - 4*x - sqrt(1 - 8*x))/(8*x) ).
 * @author Sean A. Irvine
 */
public class A389707 extends A389706 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
