package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A067764.
 * @author Sean A. Irvine
 */
public class A067655 extends A067654 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
