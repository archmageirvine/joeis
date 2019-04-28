package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A020651.
 * @author Sean A. Irvine
 */
public class A020651 extends A020650 {

  @Override
  protected Z select(final Q a) {
    return a.den();
  }
}
