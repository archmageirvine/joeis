package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A029934 Denominator of <code>n * Product_{d|n} (1 + 1/d)</code>.
 * @author Sean A. Irvine
 */
public class A029934 extends A029933 {

  @Override
  protected Z select(final Q prod) {
    return prod.den();
  }
}
