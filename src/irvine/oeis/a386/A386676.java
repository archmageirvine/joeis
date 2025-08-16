package irvine.oeis.a386;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A386676 Triangle of denominators for rational convergents to Taylor series of 1/Gamma(x+1).
 * @author Sean A. Irvine
 */
public class A386676 extends A386675 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
