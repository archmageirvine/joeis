package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A018233.
 * @author Sean A. Irvine
 */
public class A018233 extends A018232 {

  @Override
  protected Z select(final Pair<Z, Z> pair) {
    return pair.left();
  }
}

