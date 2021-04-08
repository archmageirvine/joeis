package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046219 Denominators of elements of 1/2-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046219 extends A046218 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
