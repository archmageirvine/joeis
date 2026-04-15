package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394977 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A394977 extends A394976 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
