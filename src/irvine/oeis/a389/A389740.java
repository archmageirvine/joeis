package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389740 Triangle read by rows: denominators of the almost-Riordan array ( (-6*x - 3 - 3*sqrt(12*x^2 - 8*x + 1))/(8*x^2 - 3*x - 3 + (3*x - 3)*sqrt(12*x^2 - 8*x + 1)) | 6/(3*(1 - x)*sqrt(12*x^2 - 8*x + 1) - 8*x^2 + 3*x + 3), (1 - 4*x - sqrt(12*x^2 - 8*x + 1))/(2*x) ).
 * @author Sean A. Irvine
 */
public class A389740 extends A389739 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
