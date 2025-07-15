package irvine.oeis.a385;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A385850 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A385850 extends A385849 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

