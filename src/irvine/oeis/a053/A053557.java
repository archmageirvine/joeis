package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A053557 Numerator of Sum_{k=0..n} (-1)^k/k!.
 * @author Sean A. Irvine
 */
public class A053557 extends A053556 {

  @Override
  protected Z select(final Q n) {
    return n.num();
  }
}
