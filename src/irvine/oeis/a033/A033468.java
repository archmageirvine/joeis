package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A033468 Partial sums of sequence {1/(i^2+1): i=0..n} (denominators).
 * @author Sean A. Irvine
 */
public class A033468 extends A033467 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
