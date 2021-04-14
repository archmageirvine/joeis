package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046540 Denominators of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046540 extends A046539 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
