package irvine.oeis.a035;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A035078 Numerators of partial sums of Bernoulli numbers B_{2n} = A000367/A002445.
 * @author Sean A. Irvine
 */
public class A035078 extends A035077 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
