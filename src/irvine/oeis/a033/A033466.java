package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A033466 First differences of sequence {1/(n^2+1)} (denominators).
 * @author Sean A. Irvine
 */
public class A033466 extends A033465 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

