package irvine.oeis.a040;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A040174 Denominator of probability that 2 elements of S_n chosen at random (with replacement) generate S_n.
 * @author Sean A. Irvine
 */
public class A040174 extends A040173 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
