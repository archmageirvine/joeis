package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A071282 Denominators of Peirce sequence of order 3.
 * @author Sean A. Irvine
 */
public class A071282 extends A071281 {

  @Override
  protected Z select(final Pair<Integer, Integer> q) {
    return Z.valueOf(q.right());
  }
}
