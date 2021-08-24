package irvine.oeis.a051;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A051051 Denominators of the probability that the convex hull of n+2 randomly chosen points in the unit ball B^n has n+1 vertices (with factor of Pi^n dropped for n even).
 * @author Sean A. Irvine
 */
public class A051051 extends A051050 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
