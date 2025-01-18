package irvine.oeis.a099;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A001599.
 * @author Sean A. Irvine
 */
public class A099378 extends A099377 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
