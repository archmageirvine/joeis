package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071288 extends A071287 {

  @Override
  protected Z select(final Pair<Integer, Integer> q) {
    return Z.valueOf(q.right());
  }
}
