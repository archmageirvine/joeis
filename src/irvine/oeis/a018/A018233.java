package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A018233 Consider pairs <code>(k,m)</code> such that <code>k^2</code> begins with a 1 and when the 1 is changed to a 2 we again get a square, <code>m^2</code>; sequence gives values of k for primitive solutions.
 * @author Sean A. Irvine
 */
public class A018233 extends A018232 {

  @Override
  protected Z select(final Pair<Z, Z> pair) {
    return pair.left();
  }
}

