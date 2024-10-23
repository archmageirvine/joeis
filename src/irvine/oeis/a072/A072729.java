package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A072700.
 * @author Sean A. Irvine
 */
public class A072729 extends A072728 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
