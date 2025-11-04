package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A390153 Denominator of average duration of the game "Tug of Luck" played with n coins.
 * @author Sean A. Irvine
 */
public class A390153 extends A390152 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
