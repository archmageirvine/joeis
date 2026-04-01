package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A394647 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394647 extends A394037 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}

