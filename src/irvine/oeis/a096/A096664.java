package irvine.oeis.a096;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013517;

/**
 * A096664.
 * @author Sean A. Irvine
 */
public class A096664 extends A013517 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
