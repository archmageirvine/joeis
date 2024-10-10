package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a072.A072526;

/**
 * A079479 Denominator of number J(n) arising in computation of second moment of A*_n lattice.
 * @author Sean A. Irvine
 */
public class A079479 extends A072526 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
