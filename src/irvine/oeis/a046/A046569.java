package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046569 Denominators of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046569 extends A046568 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
