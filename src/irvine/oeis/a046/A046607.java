package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046607 Denominators of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046607 extends A046606 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
