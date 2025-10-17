package irvine.oeis.a389;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A389740 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A389740 extends A389739 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
