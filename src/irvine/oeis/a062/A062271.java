package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A062271 Denominators in partial products of the twin prime constant.
 * @author Sean A. Irvine
 */
public class A062271 extends A062270 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

