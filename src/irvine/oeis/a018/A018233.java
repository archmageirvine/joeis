package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A018233 Consider pairs (k,m) such that k^2 begins with a 1 and when the 1 is changed to a 2 we again get a square, m^2; sequence gives values of k for primitive solutions.
 * @author Sean A. Irvine
 */
public class A018233 extends A018232 {

  @Override
  protected Z select(final Pair<Z, Z> pair) {
    return pair.left();
  }
}

