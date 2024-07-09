package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A071286 Denominators of Peirce sequence of order 5.
 * @author Sean A. Irvine
 */
public class A071286 extends A071285 {

  @Override
  protected Z select(final Pair<Integer, Integer> q) {
    return Z.valueOf(q.right());
  }
}
