package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A053485 Denominators in expansion of exp(2x)/(1-x).
 * @author Sean A. Irvine
 */
public class A053485 extends A053484 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

