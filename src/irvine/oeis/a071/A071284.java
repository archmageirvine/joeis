package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A071284 Denominators of Peirce sequence of order 4.
 * @author Sean A. Irvine
 */
public class A071284 extends A071283 {

  {
    setOffset(0);
  }

  @Override
  protected Z select(final Pair<Integer, Integer> q) {
    return Z.valueOf(q.right());
  }
}
