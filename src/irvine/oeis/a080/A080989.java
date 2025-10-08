package irvine.oeis.a080;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080989 extends A080988 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

