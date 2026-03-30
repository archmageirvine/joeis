package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394036 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394036 extends A394035 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

