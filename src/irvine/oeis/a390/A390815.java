package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A390815 allocated for Claude H. R. Dequatre.
 * @author Sean A. Irvine
 */
public class A390815 extends A390836 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
