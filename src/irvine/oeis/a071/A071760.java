package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A071760 Denominators of record absolute values of partial sums of Sum (mu(n)/n).
 * @author Sean A. Irvine
 */
public class A071760 extends A071759 {

  {
    setOffset(1);
  }

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
