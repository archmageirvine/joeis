package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A085963 Denominators of Farey fractions with prime numerators and denominators.
 * @author Sean A. Irvine
 */
public class A085963 extends A085962 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
